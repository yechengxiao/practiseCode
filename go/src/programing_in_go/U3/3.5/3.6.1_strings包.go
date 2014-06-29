package main

import (
	"os"
	"strings"
	"fmt"
)

func main() {
	// 去掉字符串中的空白
	input := os.Args[0]
	input = "  name  test  "

	fmt.Println(trim_white(input))

	for key, value := range strings.TrimSpace(input) {
		fmt.Print("key: ", key, " value: ", string(value), "\n")
	}

	// 替换字符串中指定的字符
	ascii_only := func(char rune) rune { // 匿名函数
		if char > 110 {
			return '!'   // 单引号指字符 ？
		}
		return char
	}

	fmt.Println(strings.Map(ascii_only, "JeromeOsterreich"))

}

//去掉字符串中的空白
func trim_white(s string) string {
	//	fiels_array := strings.Fields(s)
	//	fmt.Printf("%#v \n", fiels_array)

	return strings.Join(strings.Fields(strings.TrimSpace(s)), "_")  // 先去首尾空格，再对字符串空白进行切片，最后重组
}
