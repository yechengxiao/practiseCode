package main

import (
	"errors"
	"os"
)

func main() {

}

// 使用映射和函数引用来制造分支
var FunctionForSuffix = map[string]func(string) ([]string, error){    // 函数是一等公民
	".gz": GzipFileList, ".tar": TarFileList, ".tar.gz": TarFileList,
	".tgz": TarFileList, ".zip": ZipFileList}

func ArchiveFileListMap(file string) ([]string, error) {
	if function, ok := FunctionForSuffix[Suffix(file)]; ok {
		return function(file) // 具体哪个函数由后缀决定，在map中扩展效率更高
	}

	return nil, errors.New("unrecognized archive")
}

// 动态函数的创建
// 保存到函数的引用
var IsPalindrome func(string) bool

func init() {
	if len(os.Args) > 1 && (os.Args[1] == "-a" || os.Args[1] == "--ascii" ) {
		// TODO
	}
}

