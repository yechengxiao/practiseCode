package _3;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 * 8 . 3   枚举器(反复器)
 * <p/>
 * (1)  用一个名为 elements()的方法要求集合为我们提供一个 Enumeration。我们首次调用它的 nextElement()
 * 时,这个 Enumeration 会返回序列中的第一个元素。
 * (2) 用 nextElement() 获得下一个对象。
 * (3) 用 hasMoreElements()检查序列中是否还有更多的对象。
 */
class Hanster {
    private int hansterNumber;

    Hanster(int i) {
        hansterNumber = i;
    }

    public String toString() {
        return "This is Hanster # " + hansterNumber;
    }
}

class Printer {
    static void printAll(Enumeration e) {
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement().toString());
        }
    }
}

public class HamsterMaze {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 3; i++) {
            v.addElement(new Hanster(i));
        }
        Printer.printAll(v.elements());
    }
}
