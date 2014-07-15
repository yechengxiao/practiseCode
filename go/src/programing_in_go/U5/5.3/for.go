package main

func main() {
	// 无线循环
	//	for range

	table := make([][]string, 20)
	found := false
	x := "a"

FOUND:
for row := range table {
	for column := range table[row] {
		if table[row][column] == x {
			found = true
			break FOUND  // 跳出标签所在的循环
		}
	}


}




}
