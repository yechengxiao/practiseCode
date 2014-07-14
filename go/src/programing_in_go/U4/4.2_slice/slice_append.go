package main

import "fmt"

func main() {
	s := []string{"A", "B", "C", "D", "E", "F", "G"}
	t := []string{"K", "L", "M", "N"}
	u := []string{"m", "n", "o", "q"}

	s = append(s, "H", "J")// 添加单一的值
	s = append(s, t...) // 添加一个slice
	s = append(s, u[:len(u)]...)

	b := []byte{'U', 'V'}
	letters := "WXY"
	b = append(b, letters...)  // 将一个字符串字节添加进一个字节切片中

	fmt.Printf("%v\n %s\n", s, b)

	//========================== 插入slice的任意位置

	y := []byte{'y', 'e', 'x', 'i', 'a', 'o'}
	c := []byte{'c', 'h', 'e', 'n', 'g'}
	fmt.Printf("y: %q\n", y)
	fmt.Printf("c: %q\n", c)

	x := InsertIntoSlice(y, c, 0)
	fmt.Printf("%q\n", x)
	fmt.Printf("y: %q\n", y)
	fmt.Printf("c: %q\n", c)
}

func InsertIntoSlice(a, b []byte, index int) []byte {
	//	result := make([]byte, len(a)+len(b))
	//	at := copy(result, a[:index])
	//	at += copy(result[at:], b)
	//	copy(result[at:], a[index:])

	b = append(b, a[index:]...)
	a = append(a[:index], b...)

	return a
}
