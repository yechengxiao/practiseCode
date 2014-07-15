package main

import "fmt"

func main() {
	//	设置
	const allDone = 2
	doneCount := 0
	answerA := make(chan int)
	answerB := make(chan int)

	defer func() {
		close(answerA)
		close(answerB)
	}()

	done := make(chan bool)

	defer func() {
		close(done)
	}()

	go expensiveCompution(data1, answerA, done)
	go expensiveCompution(data2, answerB, done)

	for doneCount != allDone {
		var which, result int
		select {
		case result = <-answerA: which = 'a'  // 接收并给result
		case result = <-answerB: which = 'b'
		case <-done :doneCount++
		}
		if which != 0 {
			fmt.Printf("%c -> %d ", which, result)
		}
	}

}

func expensiveCompution(data Data, answer chan int, done chan bool) {

	// 设置...
	finished := false
	for !finished {
		// 计算...
		answer <- result   // 阻塞发送
	}
	done <- true
}
