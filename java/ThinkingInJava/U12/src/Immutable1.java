/**
 * Created by yechengxiao on 14-3-19.
 * 12. 4. 1 创建只读类
 */

public class Immutable1 {
    private int data;   // 不能被外部访问，没有其他方法改变其值

    public Immutable1(int initVal) {
        data = initVal;
    }

    public int read() {
        return data;
    }

    public boolean nonzero() {
        return data != 0;
    }

    public Immutable1 quadruple() {
        return new Immutable1(data * 4);   // 创建新对象，原对象原封未动
    }

    static void f(Immutable1 immutable1) {
        System.out.println("immutable1 = " + immutable1.read());
        Immutable1 quad = immutable1.quadruple();
        System.out.println("quad = " + quad.read());
    }

    public static void main(String[] args) {
        Immutable1 x = new Immutable1(40);
        System.out.println("x = " + x.read());
        f(x);
        System.out.println("x = " + x.read());
    }
}
