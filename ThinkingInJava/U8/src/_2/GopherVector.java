package _2;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午3:12
 * To change this template use File | Settings | File Templates.
 * 2. 生成能自动判别类型的 Vector
 */
class Gopher {//Gopher，地鼠
    private int gopherNumber;

    Gopher(int i) {
        gopherNumber = i;
    }

    void print(String msg) {
        if (msg != null) {
            System.out.println(msg);
        }
        System.out.println("Gopher number " + gopherNumber);
    }

}

class GopherTrap {
    static void caughtYa(Gopher gopher) {
        gopher.print("Caught one!");
    }
}

public class GopherVector {
    private Vector v = new Vector();

    public void addElement(Gopher m) {
        v.addElement(m);
    }

    public Gopher elementAt(int index) {
        return (Gopher) v.elementAt(index);
    }

    public int size() {
        return v.size();
    }

    public static void main(String[] args) {
        GopherVector gophers = new GopherVector();
        for (int i = 0; i < 3; i++) {
            gophers.addElement(new Gopher(i));
        }
        for (int i = 0; i < gophers.size(); i++) {
            GopherTrap.caughtYa(gophers.elementAt(i));
        }
    }

}
