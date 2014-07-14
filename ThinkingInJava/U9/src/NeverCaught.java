/**
 * Created by yechengxiao on 14-3-6.
 */

// Ignoring RuntimeExceptions

public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        int i = 5;
        while (i > 2) {
            System.out.println("i = " + i);
            i -= 1;
            try {
                g();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
