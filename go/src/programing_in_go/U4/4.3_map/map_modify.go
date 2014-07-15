package main

import "fmt"

func main() {
	aMap := map[int]string{0:"0", 1:"1", 2:"2", 3:"3"}
	fmt.Printf("before modify the map is %v\n", aMap)


	aMap[4] = "4" // 插入
	aMap[3] = "三"// 修改
	delete(aMap, 0)// 删除

	fmt.Printf("after  modify the map is %v\n", aMap)

}
