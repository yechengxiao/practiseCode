package main

import (
	"fmt"
	"unicode/utf8"
	"strings"
	"math"
)

type polar struct{
	r, o float64
}

func main() {
	fmt.Printf("%t %t\n", true, false) // 输出true, false

	fmt.Printf("%d %d\n", IntForBool(true), IntForBool(false)) // 以数值形式输出true， false

	fmt.Printf("|%b|%9b|%-9b|%09b|% 9b|\n", 37, 37, 37, 37, 37) // 二进制形式输出

	fmt.Printf("|%d|%8d|%# 8d|%+ 8d|%08f|\n", 41, 41, 41, 41, -41.1)  // 整形

	i := 569
	fmt.Printf("|$%d|$%06d|$%+06d|$%s|\n", i, i, i, pad(i, 6, (rune)('*'))) // 字符串

	for _, x := range []float64{-.258, 7194.84, -60897162.0218, 1.500089e-8} { // 浮点数
		fmt.Printf("|%20.5e|%20.5f|\n", x, x)
	}


	// =================  格式化字符串
	s := "Dare to be naive"
	fmt.Printf("|%22s|%-5s|%10s|\n", s, s, s) // 数值为域宽，超过其长度则完整输出

	ss := strings.Index(s, "n")
	fmt.Printf("|%.10s|%.*s|%-22.10s|%s|\n", s, ss, s, s, s) // 小数点右边的数表示最多输出多少个字符
	// =================  格式化字符串

	// =================  为调试格式化
	p := polar{1.1, 2.2}
	fmt.Printf("========|%T|%v|%#v|\n", p, p, p)  // %T 输出类型 %#v连同类型名一起输出
	fmt.Printf("|%T|%t|%v|\n", false, false, false)
	fmt.Printf("|%T|%v|%d|\n", 7777, 7777, 7777)
	fmt.Printf("|%T|%v|%f|\n", math.E, math.E, math.E)
	s1 := "Relativity"
	fmt.Printf("|%T|\"%v\"|\"%s\"|%q|\n", s1, s1, s1, s1) // %q 自带引号输出


	s2 := "Alias-Synonym"
	chars := []rune(s2) // ?
	bytes := []byte(s2)
	fmt.Printf("%T: %v\n%T: %v\n", chars, chars, bytes, bytes)

	i1 := 5
	f := -48.3124
	s3 := "Tom"
	fmt.Printf("|%p --> %d|%p --> %f|%#p --> %s|\n", &i1, i1, &f, f, &s3, s3) // %#p 取的地址没有0x，0x为16进制

	fmt.Printf("%.5f\n", []float64{math.E, math.E, math.E}) // 浮点数，保留5位小数

	fmt.Printf("%v\n", map[int]string{1:"A", 2:"B", 3:"C", 4:"D"})
	fmt.Printf("%#v\n", map[int]string{1:"A", 2:"B", 3:"C", 4:"D"})
	fmt.Printf("%v\n", map[int]int{1:1, 2:2, 3:4, 4:8})
	fmt.Printf("%#v\n", map[int]int{1:1, 2:2, 3:4, 4:8})
	fmt.Printf("%04b\n", map[int]int{1:1, 2:2, 3:4, 4:8})
	// =================  为调试格式化






}

func IntForBool(b bool) int32 {
	if b == true {
		return 1
	}
	return 0

}

func pad(number, width int, pad rune) string {
	s := fmt.Sprint(number)
	fmt.Println("s = ", s)
	gap := width - utf8.RuneCountInString(s)
	if gap > 0 {
		return strings.Repeat(string(pad), gap) + s
	}
	return s
}
