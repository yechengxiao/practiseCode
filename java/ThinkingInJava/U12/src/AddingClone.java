import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yechengxiao on 14-3-18.
 */
/*
You must go through a few gyrations to
add cloning to your own class.
*/
// 用Vector 进行深层复制
class Int2 implements Cloneable {
    private int i;

    Int2(int i) {
        this.i = i;
    }

    public void increment() {
        i++;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException c) {
            System.out.println("Int2 can't clone");
        }
        return o;
    }
}

class Int3 extends Int2 {
    private int j;

    public Int3(int i) {
        super(i);
    }
}

public class AddingClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Int2 x = new Int2(10);
        Int2 x2 = (Int2) x.clone();
        x2.increment();
        System.out.println("x =" + x + ", x2 = " + x2);

        Int3 x3 = new Int3(7);
        x3 = (Int3) x3.clone();

        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(new Int2(i));
        }
        System.out.println("v: " + v);

        Vector v2 = (Vector) v.clone();
        // now clone each element;
        // vector中每个对象都clone
        for (int i = 0; i < v.size(); i++) {
            v2.setElementAt(((Int2) v2.elementAt(i)).clone(), i);
        }
        // increment all v2's elements;
        for (Enumeration e = v2.elements(); e.hasMoreElements(); ) {
            ((Int2) e.nextElement()).increment();
        }
        System.out.println("v: " + v);
        System.out.println("v2: " + v2);
    }
}
