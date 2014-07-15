package main

import (
	"math"
	"fmt"
)

func main() {
	if x, err := IntFromInt64(2222222222222); err != nil {
		fmt.Printf("err is %s", err)
	} else {
		fmt.Printf("int(x) is %d ", x)
	}
}

func ConverInt64ToInt(x int64) int {
	if math.MinInt32 <= x && x <= math.MaxInt32 {
		return int(x)
	}
	panic(fmt.Sprintf("%d is out of int32 range", x)) // 产生异常
}

func IntFromInt64(x int64) (i int, err error) {
	defer func() { // 延迟处理
		if e := recover(); e != nil { // 将异常转换成错误， 如果没有转换成错误， 程序会中断
			err = fmt.Errorf("%v", e)
		}
	}()

	i = ConverInt64ToInt(x)

	return i, nil
}
