package main

import (
	"os"
	"log"
	"bufio"
	"io"
	"strings"
	"fmt"
	"path/filepath"
)

func main() {
	if len(os.Args) == 1 || os.Args[1] == "-h" || os.Args[1] == "--help" {
		fmt.Printf("usage: %s file\n", filepath.Base(os.Args[0]))
		os.Exit(1)
	}

	separators := []string{"\t", "*", "|", "."}

	linesRead, lines := readUpToNLines(os.Args[1], 5)
	counts := createCounts(lines, separators, linesRead)
	separator := guessSep(counts, separators, linesRead)
	report(separator)
}

func createCounts(lines, separators []string, linesRead int) [][]int {
	counts := make([][]int, len(separators))
	for sepIndex := range separators {
		counts[sepIndex] = make([]int, linesRead)// 二维数组初始化
		for lineIndex, line := range lines {
			counts[sepIndex][lineIndex] = strings.Count(line, separators[sepIndex])  // 出现次数
		}
	}
	return counts
}

func guessSep(counts [][]int, separators []string, linesRead int) string {
	for sepIndex := range separators {
		same := true
		count := counts[sepIndex][0]

		for lineIndex := 1; lineIndex < linesRead; lineIndex++ {
			if counts[sepIndex][lineIndex] != count {
				same = false
				break
			}
		}
		if count > 0 && same {
			return separators[sepIndex]
		}
	}
	return ""
}

func report(separator string) {
	switch separator{
	case "":fmt.Println("whitespace-separated or not separated at all")
	case "\t":fmt.Println("tab-separated")
	default :
		fmt.Printf("%s-separated \n", separator)
	}
}

func readUpToNLines(filename string, maxLines int) (int, []string) {
	var file *os.File
	var err error

	if file, err = os.Open(filename); err != nil {//  os.Open 打开文件
		log.Fatal("failed to open the file;", err)
	}

	defer file.Close()     // 关闭什么
	lines := make([]string, maxLines)
	reader := bufio.NewReader(file)

	i := 0
	for ; i < maxLines; i++ {
		line, err := reader.ReadString('\n')
		if err != nil {
			if err == io.EOF {
				break
			}
			log.Fatal("failed to finish reading the file: ", err)
		}
		if line != "" {
			lines[i] = line
		}
	}
	return i, lines[:i]
}
