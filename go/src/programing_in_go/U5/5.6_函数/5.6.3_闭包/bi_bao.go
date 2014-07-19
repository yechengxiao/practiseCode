package main

import (
	"fmt"
	"strings"
)

func main() {
	// ================================== 闭包
	addPng := func(name string) string {
		return name + ".png"
	}
	addJpg := func(name string) string {
		return name + ".jpg"
	}

	fmt.Println(addPng("Png"), addJpg("Jpg"))

	// ================================== 用工厂函数实现，简化了上述俩个匿名函数
	addZip := MakeAddSuffix(".zip")
	fmt.Println(addZip("filename"), addZip("filename.zip"))


	// ================================== 不用工厂函数的实现，没有匿名函数
	fmt.Println(AddSuffix("7z.7z", ".7z"))
	fmt.Println(AddSuffix("7z", ".7z"))

}

//工厂函数     返回一个函数
func MakeAddSuffix(suffix string) func(string) string {
	return func(name string) string {
		if !strings.HasSuffix(name, suffix) {
			return name + suffix
		}
		return name
	}
}

func AddSuffix(name, suffix string) string {
	if !strings.HasSuffix(name, suffix) {
		return name + suffix
	}
	return name
}
