/**
 * Created by yechengxiao on 14-3-6.
 */
// 继承Exception
class MyException extends Exception {
    MyException() {
    }

    MyException(String s) {
        super(s);
    }
}

public class Inheriting {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

