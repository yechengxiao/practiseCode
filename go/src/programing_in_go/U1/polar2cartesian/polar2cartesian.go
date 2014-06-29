package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"runtime"
)

type polar struct {
	radius  float64
	jiao_du float64
}
type cartesian struct {
	x float64
	y float64
}

var (
	prompt = "Enter a radius and an angle (in degrees), e.g., 12.5 90, " + "or %s to quit."
)

func init() {
	if runtime.GOOS == "windows" {   // GOOS 所运行的操作系统
		prompt = fmt.Sprintf(prompt, "Ctrl + Z, Enter")
	}   else {
		prompt = fmt.Sprintf(prompt, "Ctrl + D")
	}
}
func main() {
	questions := make(chan polar)
	defer close(questions)
	answers := createSolver(questions)
	defer close(answers)
	interact(questions, answers)
}

func createSolver(questions chan polar) chan cartesian {
	answers := make(chan cartesian)
	go func() {   // 会创建一个异步goroutine来执行这个函数
		for {
			polarCoord := <-questions
			jiao_du := polarCoord.jiao_du * math.Pi / 180.0
			x := polarCoord.radius * math.Cos(jiao_du)
			y := polarCoord.radius * math.Sin(jiao_du)
			answers <- cartesian{x, y}
		}
	}()
	return answers
}

const result = "Polar radius= %.02f jiao_du= %.02f -> Cartesian x= %.02f y= %.02f\n"

func interact(questions chan polar, answers chan cartesian) {
	reader := bufio.NewReader(os.Stdin)
	fmt.Println(prompt)
	for {
		fmt.Println("Radius and angle: ")
		line, err := reader.ReadString('\n')
		if err != nil {
			break
		}
		var radius, jiao_du float64
		if _, err := fmt.Sscan(line, "%f %f", &radius, &jiao_du); err != nil {
			fmt.Println(os.Stderr, "invalid input")
			continue
		}
		questions <- polar{radius, jiao_du}
		coord := <-answers
		fmt.Printf(result, radius, jiao_du, coord.x, coord.y)
	}
	fmt.Println()
}



