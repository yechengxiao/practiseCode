/**
 * User: yechengxiao
 * Date: 13-8-30
 * Time: 下午6:53
 * 4.4.2 构建器初始化 静态数据的初始化
 */
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Table {
    static Bowl bowl = new Bowl(1);

    Table() {
        System.out.println("Table()");
        b2.f(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl b2 = new Bowl(2);
}

class Cupboard {
    //从其他类访问Cuboard.b4，这样也会初始化对象，仅初始化一次
    Bowl b3 = new Bowl(3);//当创建对象时，最后被初始化
    static Bowl b4 = new Bowl(4);//当创建对象时，首先被初始化，仅初始化一次

    Cupboard() {//当创建对象时，成员变量初始化后，调用构造函数
        System.out.println("Cupboar()");
        b4.f(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl b5 = new Bowl(5);//当创建对象时，接着初始化，仅初始化一次
}

public class StaticInitalization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Createing new Cupboard() in main");
        new Cupboard();
        t2.f2(1);
        t3.f3(1);
    }

    static Table t2 = new Table();
    static Cupboard t3 = new Cupboard();
}
