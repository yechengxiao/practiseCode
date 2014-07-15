package main

import "log"

func main() {
	ProcessItems(items, Options{})

	errorHandler := func(item Item) {log.Println("Invalid:", item)}
	ProcessItems(items, Options{Audit : true, ErrorHandler :errorHandler})


}

// 可选参数的函数   使用struct实现  // struct 聚合了多个类型的字段， struct会进行默认的初始化
type Options struct {
	First int                    // 要处理的第一项
	Last  int                    // 要处理的最后一项（0意味着要从第一项开始处理所有项）
	Audit bool                   // 如果为true， 所有动作都被记录
	ErrorHandler func(item Item) // 如果不是nil， 对每一个坏项周用一次
}

func ProcessItems(item Item, options Options) {
}
