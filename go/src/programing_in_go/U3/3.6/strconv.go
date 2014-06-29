package main

import (
	"fmt"
	"strconv"
)

func main() {
	//	哪些表示True， 哪些表示False
	//	1, t, F, true...  --> True
	//	0, f, F, false... --> False

	for _, truth := range []string{"1", "T", "TRUE", "false", "F", "0", "5"} {
		if b, err := strconv.ParseBool(truth); err != nil { // 转换成bool
			fmt.Printf("\n {%v} \n", err)
		} else {
			fmt.Print(b, " ")
		}
	}


	//	=============================================
	x, err := strconv.ParseFloat("-99.7", 64)
	fmt.Printf("%8T %6v %v\n", x, x, err)
	y, err := strconv.ParseInt("888888", 10, 0)
	fmt.Printf("%8T %6v %v\n", y, y, err)
	z, err := strconv.Atoi("71309")
	fmt.Printf("%8T %6v %v\n", z, z, err)


	s := strconv.FormatBool(z > 100)
	fmt.Println(s)
	//	字符串转换成整形
	i, err := strconv.ParseInt("0xDEEF", 0, 32)// 0表示自动判断数据进制
	fmt.Println(i, err)
	j, err := strconv.ParseInt("0707", 0, 32)
	fmt.Println(j, err)
	k, err := strconv.ParseInt("10111010001", 2, 32)
	fmt.Println(k, err)

	//	=============================================
	fmt.Println()
	var ii int = 16769023
	fmt.Println(strconv.Itoa(ii)) // Integer to ASCII
	fmt.Println(strconv.FormatInt(int64(ii), 10))  // 整形转换成字符串
	fmt.Println(strconv.FormatInt(int64(ii), 2))
	fmt.Println(strconv.FormatInt(int64(ii), 16))

	//	=============================================
	fmt.Println()
	s = "alle ansker var fit"
	quoted := strconv.Quote(s) // 加上引号
	fmt.Println(quoted)
	fmt.Println(strconv.Unquote(quoted))

}
