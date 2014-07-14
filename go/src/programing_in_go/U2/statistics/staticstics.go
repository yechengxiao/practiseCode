package main

import (
	"sort"
	"net/http"
	"log"
	"fmt"
	"strings"
	"strconv"
)

const (
	pageTop = `<!DOCTYPE HTML><html>
	 <head>
	 <style>.error{color:#FF0000;}</style>
	 <title>Statistics</title>
	 </head>
	 <body>
	 <h3>Statistics</h3>
	 <p>Computes basics statistics for a given list of numbersK/p>`

	form = `<form action ="/" method="POST">
	<label for="numbers">Numbers(comma or space-separated):</label><br/>
	<input type="text" name="numbers" size="30"><br/>
	<input type="submit" value="Calculate">
	</form>`

	pageBottom = `</body></html>`

	anError = `<p class="erros">%s</p>`
)

type statistics struct{
	numbers  []float64
	mean     float64
	median   float64
}

func getStats(numbers []float64) (stats statistics) {
	stats.numbers = numbers
	sort.Float64s(stats.numbers)// 排序
	stats.mean = sum(numbers)/float64(len(numbers))
	stats.median = median(numbers)
	return stats
}


func sum(numbers []float64) (total float64) {
	for _, x := range numbers {
		total += x
	}
	return total
}

func median(numbers []float64) float64 {  // 中间值
	middle := len(numbers) / 2 // 两个数都是整数，结果也是整数
	result := numbers[middle]
	if len(numbers)%2 == 0 {// 若为偶数
		result = (result+numbers[middle+1])/2
	}
	return result
}

func main() {
	http.HandleFunc("/", homePage)

	if err := http.ListenAndServe(":9002", nil); err != nil {
		log.Fatal("failed to start server", err)
	}
}

func homePage(writer http.ResponseWriter, request *http.Request) {
	err := request.ParseForm()  // 必须在写响应内容之前调用
	fmt.Fprint(writer, pageTop, form)
	if err != nil {
		fmt.Fprint(writer, anError, err)
	} else {
		if numbers, message, ok := processRequest(request); ok {
			stats := getStats(numbers)
			fmt.Fprint(writer, formatStats(stats))
		} else if message != "" {
			fmt.Fprint(writer, anError, message)
		}
	}
	fmt.Fprint(writer, pageBottom)
}

func processRequest(request *http.Request) ([]float64, string, bool) {
	var numbers []float64
	if slice, found := request.Form["numbers"]; found && len(slice) > 0 { // 输入为空
		text := strings.Replace(slice[0], ",", " ", -1)
		for _, field := range strings.Fields(text) {
			if x, err := strconv.ParseFloat(field, 64); err != nil { // 非数值
				return numbers, "'"+field+"' is invalid", false
			}else {
				numbers = append(numbers, x)
			}
		}
	}
	if len(numbers) == 0 {
		return numbers, "", false // no data first time form is shown
	}
	return numbers, "", true
}

func formatStats(stats statistics) string {
	return fmt.Sprintf(
		`<table border="1">
		<tr><th colspan="2">Results</th></tr>
		<tr><td>Numbers</td><td>%v</td></tr>
		<tr><td>Count</td><td>%d</td></tr>
		<tr><td>Mean</td><td>%f</td></tr>
		<tr><td>Median</td><td>%f</td></tr>
		</table>`, stats.numbers, len(stats.numbers), stats.mean, stats.median)
}
