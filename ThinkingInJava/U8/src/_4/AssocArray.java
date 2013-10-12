package _4;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午4:25
 * To change this template use File | Settings | File Templates.
 * 8 . 4 . 4   H a s h t a b l e
 * Simple version of a Dictionary
 * 两个 Vector,一个用于容纳键,另一个用来容纳值
 */
public class AssocArray extends Dictionary {
    private Vector keys = new Vector();
    private Vector values = new Vector();

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public boolean isEmpty() {
        return keys.isEmpty();
    }

    @Override
    public Enumeration keys() {
        return keys.elements();
    }

    @Override
    public Enumeration elements() {
        return values.elements();
    }

    @Override
    public Object get(Object key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        return values.elementAt(index);
    }

    @Override
    public Object put(Object key, Object value) {
        keys.addElement(key);
        values.addElement(value);
        return keys;
    }

    @Override
    public Object remove(Object key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        keys.removeElementAt(index);
        Object returnval = values.elementAt(index);
        values.removeElementAt(index);
        return returnval;
    }

    public static void main(String[] args) {
        AssocArray aa = new AssocArray();

        for (char c = 'a'; c <= 'z'; c++) {
            aa.put(String.valueOf(c), String.valueOf(c).toUpperCase());
        }
        char[] ca = {'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < ca.length; i++) {
            System.out.println("Uppercase: " + aa.get(String.valueOf(ca[i])));
        }
    }
}
