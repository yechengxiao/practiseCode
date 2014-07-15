package main

import (
	"fmt"
	"sort"
)

func main() {
	aMap := map[int]string{0:"0", 1:"1", 2:"2", 3:"3"}

	if value, found := aMap[1]; found {
		fmt.Printf("aMap[%d] is found, the value is %v", 1, value)
	}


	// ====================================================
	populationForCity := map[string]int{"Istanbul":12610000, "Karachi":1062000, "Mumbai":12690000, "ShangHai":1368000}

	cities := make([]string, 0, len(populationForCity))

	for city := range populationForCity {
		cities = append(cities, city)
	}

	sort.Strings(cities)
	for _, city := range cities {
		fmt.Printf("city %-10s has population %d \n", city, populationForCity[city])
	}


}
