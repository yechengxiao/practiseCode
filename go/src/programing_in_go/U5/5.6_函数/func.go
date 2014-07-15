package main

import (
	"math"
	"fmt"
)

func main() {
	for i := 1; i < 4; i++ {
		a, b, c := PythagoreanTriple(i, i+1)
		aa := Heron(a, b, c)
		bb := Heron(PythagoreanTriple(i, i+1))  // 函数式编程 函数的调用作函数的参数。其实就是返回值作为参数。

		fmt.Printf("_1 == %10f, _2 == %10f \n", aa, bb)
	}
}


func Heron(a, b, c int) float64 {
	a1, b1, c1 := float64(a), float64(b), float64(c)
	s := (a1 + b1 + c1) / 2
	return math.Sqrt(s * (s - a1) * (s - b1) * ( s - c1))
}

func PythagoreanTriple(m, n int) (a, b, c int) {
	if m < n {
		m, n = n, m
	}
	a = (m*m)-(n*n)
	b = (2*m*n)
	c = (m*m)+(n*n)
	return a, b, c
}
