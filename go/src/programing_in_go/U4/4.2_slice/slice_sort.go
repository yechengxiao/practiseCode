// 排序、 搜索slice
package main

import (
	"fmt"
	"sort"
	"strings"
)

func main() {
	files := []string{"Test.conf", "util.go", "Makefile", "misc.go", "main.go"}
	fmt.Printf("Unsorted: %q \n", files)

	// 区分大小写排序
	sort.Strings(files)
	fmt.Printf("Unserlying bytes: %q \n", files)

	// 不区分大小写排序
	SortFoldedStrings(files)
	fmt.Printf("Case insensitive %q\n", files)
}

func SortFoldedStrings(slice []string) {
	// 内置类型与自定义类型间的转换
	sort.Sort(FoldedStrings(slice))  // 对任意类型排序
}

// 自定义类型，下面实现3个方法
type FoldedStrings []string

// 实现接口中的方法
func (slice FoldedStrings) Len() int {
	return len(slice)
}

func (slice FoldedStrings) Less(i, j int) bool {
	return strings.ToLower(slice[i]) < strings.ToLower(slice[j])
}

func (slice FoldedStrings) Swap(i, j int) {
	slice[i], slice[j] = slice[j], slice[i]
}




