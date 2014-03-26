/**
 * Created by yechengxiao on 14-3-6.
 */
//创建自己的违例时,还可以采取更多的操作。我们可添加额外的构建器及成员:

class MyException2 extends Exception {
    private int i;

    MyException2() {
    }

    MyException2(String s) {
        super(s);
    }

    MyException2(String msg, int x) {
        super(msg);
        i = x;
    }

    public int val() {
        return i;
    }
}

public class Inheriting2 {
    public static void f() throws MyException2 { // 1. 声明抛出异常，但代码体内可不抛出。
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();    // 2. 显示抛出异常，必须声明throws
    }

    public static void g() throws MyException2 {
        System.out.println("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Originated in h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 exception2) {
            exception2.printStackTrace();
        }
        try {
            g();
        } catch (MyException2 exception2) {
            exception2.printStackTrace();
        }
        try {
            h();
        } catch (MyException2 exception2) {
            exception2.printStackTrace();
            System.out.println("exception2.val() = " + exception2.val());
        }
    }
}
