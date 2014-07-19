package main

import (
	"fmt"
	"unicode/utf8"
)

func main() {
	for i := 0; i < 20 ; i++ {
		fmt.Print(Fibonacci(i), " ")
	}

	females := make([]int, 20)
	males := make([]int, len(females))
	fmt.Println()

	// =====================
	for n := range females {
		females[n] = HofstadterFemale(n)
		males[n] = HofstadteMale(n)
	}
	fmt.Println("F", females)
	fmt.Println("M", males)

	// =====================
	fmt.Println(IsPalindrome("abcba"))
	fmt.Println(IsPalindrome("abcaa"))

}

//================= 斐波那契数列
func Fibonacci(n int) int {
	if n < 2 {// 中止条件
		return n
	}
	return Fibonacci(n - 1) + Fibonacci(n - 2)
}

//================= 相互递归
func HofstadterFemale(n int) int {
	if n <= 0 {
		return 1
	}
	return n - HofstadteMale(HofstadterFemale(n - 1))
}

func HofstadteMale(n int) int {
	if n <= 0 {
		return 0
	}
	return n - HofstadterFemale(HofstadteMale(n - 1))
}

//================= 递归 回文单词
func IsPalindrome(word string) bool {
	if utf8.RuneCountInString(word) <= 1 {
		return true
	}

	fisrt, sizeOfFirst := utf8.DecodeRuneInString(word)// 返回字符、及占用的字节数
	last, sizeOfLast := utf8.DecodeLastRuneInString(word)

	if fisrt != last {
		return false
	}

	return IsPalindrome(word[sizeOfFirst:len(word) - sizeOfLast])

}
