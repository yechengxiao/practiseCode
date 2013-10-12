package _4;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 * 8 . 4 . 4   H a s h t a b l e
 * 作为应用散列表的一个例子,可考虑用一个程序来检验 Java 的 Math.random() 方法的随机性到底如何。
 */
class Counter {
    int i = 1;

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

public class Statistics {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        for (int i = 0; i < 1000; i++) {
            Integer r = new Integer((int) (Math.random() * 20));
            if (ht.containsKey(r)) {
                //若已在集合里,则 get()方法获得那个键关联的值,此时是一个Counter(计数器)对象。计数器内的值 i 随后会增加 1,表明这个特定的随机数字又出现了一次。
                ((Counter) ht.get(r)).i++;//??
            } else {
                ht.put(r, new Counter());
            }
        }
        System.out.println(ht);

        // /除
        float a1 = 4.2f;
        float a2 = 2.2f;
        int a3int = (int) ((int) a1 / a2);
        float a3float = a1 / a2;

        System.out.println("a3int=" + a3int);
        System.out.println("a3float=" + a3float);
    }
}
