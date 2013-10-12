package _5;

import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-10
 * Time: 下午2:53
 * To change this template use File | Settings | File Templates.
 */
public class StringSortTest {
    static class StringCompare implements Compare {

        @Override
        public boolean lessThan(Object lhs, Object rhs) {
            return ((String) lhs).toLowerCase().compareTo(((String) rhs).toLowerCase()) < 0;
        }

        @Override
        public boolean lessThanOrEqual(Object lhs, Object rhs) {
            return ((String) lhs).toLowerCase().compareTo(((String) rhs).toLowerCase()) <= 0;
        }
    }

    public static void main(String[] args) {
        SortVector sv = new SortVector(new StringCompare());
        sv.addElement("d");
        sv.addElement("A");
        sv.addElement("C");
        sv.addElement("c");
        sv.addElement("b");
        sv.addElement("B");
        sv.addElement("D");
        sv.addElement("a");
        sv.sort();
        Enumeration e = sv.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
