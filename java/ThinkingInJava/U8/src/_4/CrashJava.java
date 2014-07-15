package _4;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午3:56
 * To change this template use File | Settings | File Templates.
 * 8 . 4 . 1   V e c t o r
 */
public class CrashJava {
    @Override
    public String toString() {
        return "CrashJava addrdss: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(new CrashJava());
        }
        System.out.println(v);
    }
}
