/**
 * User: yechengxiao
 * Date: 13-8-30
 * Time: 下午7:40
 * 4.4.2 构建器初始化 3. 明确进行的静态初始化
 */
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup c1;
    static Cup c2;

    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }
}

public class ExplicipStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.c1.f(99);//这里不再执行对象的初始化
    }

    static Cups x = new Cups();
    static Cups y = new Cups();
}
