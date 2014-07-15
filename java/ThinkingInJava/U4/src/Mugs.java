/**
 * User: yechengxiao
 * Date: 13-8-30
 * Time: 下午7:48
 * 4.4.2 构建器初始化  4. 非静态实例的初始化
 * 初始化顺序：static成员函数(仅初始化一次)>static块(仅初始化一次)>成员变量(仅在每次new时初始化)>块(仅在每次new时初始化)>构造函数
 */
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {
    Mug c1 = new Mug(3);
    Mug c2;

    {
        c1 = new Mug(1);
        c2 = new Mug(2);
        System.out.println("c1 & c2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Mugs x = new Mugs();
    }
}
