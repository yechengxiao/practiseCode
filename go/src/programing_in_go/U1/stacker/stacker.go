package main

import (
	"fmt"
	"stacker/stack"
)

func main() {
	var hsystack stack.Stack
	hsystack.Push("hay")
	hsystack.Push(-15)
	hsystack.Push([]string{"pin", "clip", "needle"})
	hsystack.Push(81.52)

	for {
		item, err := hsystack.Pop()
		if err != nil {
			break
		}
		fmt.Println(item)
	}
}
