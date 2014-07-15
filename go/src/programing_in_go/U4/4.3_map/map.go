package main

import "fmt"

type Point struct{
	x, y, z int
}

func main() {
	// 声明方式1
	aMap := make(map[string]string) //等同于 map[string]string{}

	// 赋值
	aMap["map1"] = "this_is_1"
	aMap["map2"] = "this_is_2"
	aMap["map3"] = "this_is_3"
	aMap["map4"] = "tis_is_4"

	fmt.Printf("The map is %#v\n", aMap)

	// 声明方式2
	bMap := map[string]string{"key1":"value1", "key2":"value2", "key3":"value3"}
	fmt.Printf("The map is %v\n", bMap)

	// =====================================
	// key为指针
	triangle := make(map[*Point]string)
	triangle[&Point{89, 47, 27}] = "a"
	triangle[&Point{86, 65, 86}] = "b"
	triangle[&Point{7, 44, 45}] = "c"

	fmt.Println(triangle)

	// =====================================
	for key, value := range triangle {
		fmt.Printf("key is %s, value is %s\n", key, value)
	}

}

func (point Point) String() string {
	return fmt.Sprintf("%d，%d，%d", point.x, point.y, point.z)
}
