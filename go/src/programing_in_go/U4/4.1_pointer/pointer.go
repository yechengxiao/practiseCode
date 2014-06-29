package main

import (
	"fmt"
	"image/color"
)

type composer struct{
	name     string
	birthday int
}
type rectangle struct{
	x0, y0, x1, y1 int
	fill           color.RGBA
}

func main() {
	i := 9
	j := 5
	product := 0

	fmt.Printf("%v %v %v \n", i, j, product)
	swapAndProduct1(&i, &j, &product) // 取址操作
	fmt.Printf("%v %v %v \n", i, j, product)

	i = 9
	j = 5
	product = 0
	i, j, product = swapAndProduce2(i, j, product)
	fmt.Printf("%v %v %v \n", i, j, product)

	// ==========================使用 new()函数创建指针
	agnes := new(composer) // 指向composer的指针
	agnes.name = `name`
	agnes.birthday = 19900101

	fmt.Println(agnes)

	agens1 := &composer{}  // 与使用new()函数效果一样
	// var agens1 *composer = &composer{}
	agens1.name = `name1`
	agens1.birthday = 19910101

	fmt.Println(agens1)

	// ==========================切片与映射都是引用类型， 所有修改都是可见的
	grades := []int{87, 55, 43, 71, 60, 43, 32, 19, 63}
	inflate(grades, 3)
	fmt.Println(grades)

	// ========================== . 操作符能自动解引用结构体
	rect := rectangle{4, 8, 20, 10, color.RGBA{0xFF, 0, 0, 0xFF}}
	fmt.Println(rect)
	resizeRect(&rect, 5, 5)
	fmt.Println(rect)


}

func swapAndProduct1(x, y, product *int) { // 不建议这种开销不大的情况使用指针  要传多个值，可以使用切片或映射。类型不一致时可以使用struct，然后使用指针
	if *x > *y { // 内容操作
		*x, *y = *y, *x
	}
	*product = *x**y
}

func swapAndProduce2(x, y, product int) (int, int, int) { // 改进版
	if x > y {
		x, y = y, x
	}
	product = x*y
	return x, y, product
}

func inflate(numbers []int, factor int) {
	for k := range numbers {
		numbers[k] *= factor
	}
}

func resizeRect(rect *rectangle, width, height int) {
	rect.x1 += width // "." 操作符能自动解引用结构体，不需要这样 *rect.x1 = width
	rect.y1 +=height
}
