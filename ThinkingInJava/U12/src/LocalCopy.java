/**
 * Created by yechengxiao on 14-3-18.
 */

//成功的克隆,浅层复制
class MyObject implements Cloneable {
    int i;

    MyObject(int ii) {
        this.i = ii;
    }

    // 改成public，使用super.clone，实现Cloneable接口
    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("MyObject can't clone");
        }
        return o;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

public class LocalCopy {
    static MyObject g(MyObject myObject) { // 不进行克隆
        myObject.i++;
        return myObject;
    }

    static MyObject f(MyObject myObject) {
        myObject = (MyObject) myObject.clone();// local copy，进行克隆
        myObject.i++;
        return myObject;
    }

    public static void main(String[] args) {
        MyObject a = new MyObject(11);
        MyObject b = g(a);

        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        MyObject c = new MyObject(47);
        MyObject d = f(c);

        if (c == d) {
            System.out.println("c ==d ");
        } else {
            System.out.println("c != d");
        }
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

}
