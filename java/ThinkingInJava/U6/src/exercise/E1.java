package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 下午4:22
 * To change this template use File | Settings | File Templates.
 * 练习1
 */
class A extends C {
    A() {
        A a;
    }
}

class B {
    B() {
        B b;
    }
}

class C {
    B b;
}

public class E1 {
    public static void main(String[] args) {
        C c = new C();
    }
}
