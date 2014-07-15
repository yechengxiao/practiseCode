package main

import (
	"fmt"
	"sort"
	"strings"
)

func main() {
	files := []string{"Test.conf", "util.go", "Makefile", "misc.go", "main.go"}
	target := "Makefile"

	// 这种线性搜索再遇到大切片时效率很低
	for i, file := range files {
		if file == target {
			fmt.Printf("found \"%s\" at files[%d] \n", file, i)
			break
		}
	}

	// ==============================================
	// 使用二分法搜索效率很高
	sort.Strings(files) // 先排序
	fmt.Printf("%q\n", files)

	//	固定这么写	//	建议看懂Search的说明
	i_ := sort.Search(len(files), func(i_ int) bool {return files[i_] >= target})

	if i_ < len(files) && files[i_] == target {
		fmt.Printf("0 found \"%s\" at  file[%d] \n", files[i_], i_)
	}


	// ==================================================== 有问题的
	target = "makefile"
	//	SortFoldedStrings(files) // 这里怎么调用，同一包下的另一个函数？？
	fmt.Printf("%q\n", files)

	j := sort.Search(len(files), func(j int) bool {return strings.ToLower(files[j]) >= target})// 转成小写
	if j < len(files) && strings.EqualFold(files[j], target) { // 不区分大小写
		fmt.Printf("1 found \"%s\" at  fjle[%d] \n", files[j], j)
	}

}


