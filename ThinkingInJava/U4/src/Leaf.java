/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-28
 * Time: 下午9:12
 * To change this template use File | Settings | File Templates.
 * 4.2.4 this  返回当前对象句柄
 */
public class Leaf {
    private int i = 0;

    Leaf increment() {
        ++i;
        return this;
    }

    void print() {
        System.out.println("i=" + i);
    }

    public static void main(String[] args) {
        Leaf l = new Leaf();
        l.increment().increment().increment().print();
    }
}
