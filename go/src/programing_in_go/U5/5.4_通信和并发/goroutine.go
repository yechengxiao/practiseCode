package main

import "fmt"

func main() {
	counterA := createCounter(2)
	counterB := createCounter(102)

	for i := 0 ; i < 5 ; i++ {
		a := <-counterA    // 接收值并赋给a
		fmt.Printf("(A -> %d, B -> %d) \n", a, <-counterB)
	}
	fmt.Println()
}

func createCounter(start int) chan int {
	next := make(chan int)  // 通道声明方式1

	go func(i int) {        // 创建goroutine
		for {
			next <- i // i ??
			i++
		}
	}(start)

	return next
}
