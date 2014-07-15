/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-29
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 * 4.4.2 构建器初始化
 * 1. 初始化顺序  初始化的顺序是由变量在类内的定义顺序决定
 */
class Tag {
    Tag(int marker) {
        System.out.println("Tag(" + marker + ")");
    }
}

class Card {//成员变量初始化比构造方法还早
    Tag ta = new Tag(1);

    Card() {
        System.out.println("Card()");
        t3 = new Tag(33);
    }

    Tag t2 = new Tag(2);

    void f() {
        System.out.println("f()");
    }

    Tag t3 = new Tag(3);
}

public class OrderOfInit {
    public static void main(String[] args) {
        Card t = new Card();
        t.f();
    }
}
