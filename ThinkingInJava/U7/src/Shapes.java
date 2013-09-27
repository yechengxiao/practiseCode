/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-27
 * Time: 上午10:40
 * To change this template use File | Settings | File Templates.
 * 7.2.2 产生正确的行为
 * 动态绑定
 */
class Shape {
    void draw() {
    }

    void erase() {
    }
}

//衍生类覆盖基类方法
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Triangle.erase()");
    }
}

public class Shapes {
    public static Shape randShape() {
        switch ((int) (Math.random() * 3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = randShape();
        }
        for (int i = 0; i < s.length; i++) {
            s[i].draw();
        }
    }
}
