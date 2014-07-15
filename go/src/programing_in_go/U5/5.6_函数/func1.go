package main

import "fmt"

func main() {

	fmt.Printf("The miinimum int is %d\n", MinimumInt1(4, 6, 8, -1, 9, 3))
}

// 可变参数函数， 参数相当于slice
func MinimumInt1(first int, rest ...int) int {  // 注意类型分开来
	for _, x := range rest {   // rest 相当于slice
		if x < first {
			first = x
		}
	}
	return first
}
