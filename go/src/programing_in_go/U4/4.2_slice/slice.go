package main

import "fmt"

type slice_struct struct{
	x, y int
}

type StringSlice []string

func (s slice_struct) String() string {
	return fmt.Sprintf("{%d %d}", s.x, s.y) //fmt.Println(structs) 使用String()输出内容，而不是内存地址
}

func main() {
	strSlice := StringSlice("1", "2", "3") // slice 声明的另一种方式
	fmt.Print(strSlice)

	// ========================= slice中存放struct
	struct_in_slice := []slice_struct{{1, 1}, {2, 2}}
	fmt.Println(struct_in_slice)

	structs := []*slice_struct{{3, 3}, {4, 4}}
	fmt.Println(structs)

	// ========================= 数组
	amounts := []float64{200.11, 200.11, 200.11}
	sum := 0.0
	for _, amount := range amounts { // for range 不能修改amount的值
		sum += amount
	}
	fmt.Println(sum)

	for _, s := range structs {  // 这里式指针，所有for range修改了值
		s.x = 5       // 自动对结构体进行解引用
		s.y = 6
	}
	fmt.Println(structs)


	// ========================= 数值，定长  建议使用切片代替数值，切片长度可变，容量固定，传递代价小
	var buffer [20]byte  // 声明方式1
	var grid [3][3]int
	grid [1][0], grid [1][1], grid[1][2] = 8, 6, 2

	grid1 := [3][3]int {{4, 3}, {8, 6, 2}}                             // 声明方式2

	cities := [...]string{"shanghai", "mumbai", "istanbul", "beijing"} // 声明方式3
	cities[len(cities)-1] = "karachi"

	fmt.Printf("%-8s | %2s | %s\n", "Type", "Len", "Contents")

	fmt.Printf("%-8T ｜ %2d ｜ %v\n", buffer, len(buffer), buffer)
	fmt.Printf("%-8T ｜ %2d ｜ %q\n", cities, len(cities), cities)
	fmt.Printf("%-8T ｜ %2d ｜ %v\n", grid, len(grid), grid)
	fmt.Printf("%-8T ｜ %2d ｜ %v\n", grid1, len(grid), grid1)



	// ========================= 切片，长度可变，容量固定  建议使用切片代替数值，传递代价小
	s := []string{"A", "B", "C", "D", "E", "F"}  // 声明方式1
	t := s[:5]
	u := s[3:len(s)-1]
	fmt.Println(s, t, u)
	u[1] = "X"
	fmt.Println(s, t, u)
	fmt.Printf("len(s): %v  cap(s):%v\n", len(s), cap(s))
	fmt.Printf("len(t): %v  cap(t):%v\n", len(t), cap(t))
	fmt.Printf("len(u): %v  cap(u):%v\n", len(u), cap(u))

	bufer := make([]byte, 20, 60)  // 声明方式2  使用make() 函数，更通用，可以创建slice、map、通道
	grid2 := make([][]int, 3)      // 声明方式3
	for i := range grid2 {
		grid2[i] = make([]int, 3)
	}
	grid2[1][0], grid2[1][1], grid2[1][2] = 8, 6, 2

	grid3 := [][]int {{4, 3, 0}, {8, 6, 2}, {0, 0, 0}}
	cities1 := []string{"ShangHai", "Mumbai", "Istanbul", "Beijing"}

	cities1[len(cities1)-1] = "Karachi"

	fmt.Printf("%-10s | %2s | %2s | %s\n", "Type", "Len", "Cap", "Contents")

	fmt.Printf("%-10T ｜ %2d ｜ %2d ｜ %v\n", bufer, len(bufer), cap(bufer), bufer)
	fmt.Printf("%-10T ｜ %2d ｜ %2d ｜ %q\n", cities1, len(cities1), cap(cities1), cities1)
	fmt.Printf("%-10T ｜ %2d ｜ %2d ｜ %v\n", grid2, len(grid2), cap(grid2), grid2)
	fmt.Printf("%-10T ｜ %2d ｜ %2d ｜ %v\n", grid3, len(grid3), cap(grid3), grid3)

}
