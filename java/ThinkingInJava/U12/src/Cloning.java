import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yechengxiao on 14-3-18.
 */
class Int {
    private int i;

    public Int(int ii) {
        i = ii;
    }

    public void increment() {
        i++;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

public class Cloning {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(new Int(i));
        }
        System.out.println("v: " + v);

        // Increment all v2's elements
        Vector v2 = (Vector) v.clone(); // 只复制了一个对象的“表面”部分
        for (Enumeration e = v2.elements(); e.hasMoreElements(); ) {
            ((Int) e.nextElement()).increment();
        }
        System.out.println("v: " + v);
    }

}
