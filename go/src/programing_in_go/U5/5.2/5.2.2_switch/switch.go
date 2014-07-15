package main

import "fmt"

func main() {
	i := 32

	// switch 经典用法
	// 有时候可以代替if，并比if紧凑
	switch string(i){
	case "32" :fmt.Print(i)
	case "31":fmt.Print(i)
	case "30", "29":fmt.Print(i)
	}

	// 反序列化， 已知json的结构
	var state State
	MA := []string(`{"name":"Massachusetts", "area":27336, "water":25.7, "senators":["John Kerry", "Scott Brown"]}`)

	if err := json.Unmarshal(MA, &state); err != nil {
		fmt.Println(err)
	}
	fmt.Println(state)

}

func classifier(items...interface{}) {
	// what's the type of x
	for i, x := range items {
		switch x.(type){
		case bool:fmt.Print()
		case float64 :fmt.Print()
		case int, int8, int16, int32, int64:fmt.Print()
		case uint, uint8, uint16, uint32, uint64:fmt.Print()
		case nil: fmt.Print()
		case string :fmt.Print()
		default :fmt.Print()
		}
	}
}

func json() { // 反序列化  不知json结构
	MA := []string(`{"name":"Massachusetts", "area":27336, "water":25.7, "senators":["John Kerry", "Scott Brown"]}`)
	var object interface{}

	if err := json.Unmarshal(MA, &object); err != nil {
		fmt.Println(err)
	} else {
		// 断言   返回map[string]interface{}类型的数据
		jsonObject := object.(map[string]interface{})

		fmt.Println(jsonObjectAsString(jsonObject))
	}
}

func jsonObjectAsString(jsonObject map[string]interface{}) string {
	var buffer byte.Buffer
	buffer.WriteString("{")
	comma := ""

	for key, value := range jsonObject {
		buffer.WriteString(comma)

		switch value := value.(type){ // 先判断其类型
		case nil :
			fmt.Fprintf(&buffer, "%q: null", key)
		case bool :
			fmt.Fprintf(&buffer, "%q: %t", key, value)
		case float64 :
			fmt.Fprintf(&buffer, "%q: %f", key, value)
		case string:
			fmt.Fprintf(&buffer, "%q: %s", key, value)
		case []interface{}:
			fmt.Fprintf(&buffer, "%q: [", key)
			innerComma := ""
		for _, s := range value {
			if s, ok := s.(string); ok {
				fmt.Fprintf(&buffer, "%s %q", innerComma, s)
				innerComma = ", "
			}
		}
			buffer.WriteString("]")
		}
		comma = ", "
	}
	buffer.WriteString("}")
	return buffer.String()
}

type State struct{
	Name     string //  首字幕大写， 可导出
	Senators []string
	Water    float64
	Area     int
}
