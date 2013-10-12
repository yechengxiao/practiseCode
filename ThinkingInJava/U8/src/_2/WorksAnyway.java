package _2;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午2:49
 * To change this template use File | Settings | File Templates.
 * 8.2
 * 1. 错误有时并不显露出来
 */
class Mouse {
    private int mouseNumber;

    Mouse(int i) {
        mouseNumber = i;
    }

    @Override
    public String toString() {
        return "This is Mouse # " + mouseNumber;
    }

    void print(String msg) {
        if (msg != null) {
            System.out.println(msg);
        }
        System.out.println("Mouse number " + mouseNumber);

    }
}

class MouseTrap {
    static void caughtYa(Object m) {
        Mouse mouse = (Mouse) m;
        mouse.print("Caught one!");
    }
}


public class WorksAnyway {
    public static void main(String[] args) {
        Vector mice = new Vector();
        for (int i = 0; i < 3; i++) {
            mice.addElement(new Mouse(i));
        }
        for (int i = 0; i < mice.size(); i++) {
            //一旦编译器碰到一个字串,后面跟随一个“+”,就会希望后面又跟随一个字串,并自动调用 toString()。
            System.out.println("Free mouse " + mice.elementAt(i));

            //caughtYa()方法接收的不是一个 Mouse,而是一个Object。随后再将其造型为一个 Mouse。当然,这样做是非常冒失的,因为通过接收一个 Object,任何东西都可以传递给方法。
            MouseTrap.caughtYa(mice.elementAt(i));
        }

    }
}
