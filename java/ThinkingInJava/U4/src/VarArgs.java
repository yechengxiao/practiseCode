/**
 * User: yechengxiao
 * Date: 13-8-30
 * Time: 下午9:00
 * 4.5  数组初始化
 */
class A {
    int i;
}

public class VarArgs {
    static void f(Object[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        f(new Object[]{
                new Integer(47), new VarArgs(),//toString()
                new Float(3.14), new Double(11.11)
        });
        f(new Object[]{"one", "two", "three"});
        f(new Object[]{new A(), new A(), new A()});
    }
}
