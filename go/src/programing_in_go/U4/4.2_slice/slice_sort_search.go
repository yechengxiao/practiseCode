// 排序、 搜索slice
package main

import (
	"fmt"
	"sort"
)

func main() {
	files := []string{"Test.conf", "util.go", "Makefile", "misc.go", "main.go"}
	fmt.Printf("Unsorted: %q \n", files)

	// 区分大小写排序
	sort.Strings(files)
	fmt.Printf("Unserlying bytes: %q \n", files)

	// 不区分大小写排序
	//	TODO continue



}



