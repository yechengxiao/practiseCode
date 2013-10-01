package eight;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-30
 * Time: 下午3:00
 * To change this template use File | Settings | File Templates.
 * 7 . 8 . 2   下溯造型与运行期类型标识(RTTI)
 */
class Useful {
    public void f() {
        System.out.println("Useful f()");
    }

    public void g() {
        System.out.println("Useful g()");
    }
}

class MoreUseful extends Useful {
    public void f() {
        System.out.println("MoreUseful f()");
    }

    public void g() {
        System.out.println("MoreUseful g()");
    }

    public void u() {
        System.out.println("MoreUseful u()");
    }

    public void v() {
    }

    public void w() {
    }
}

public class RTTI {
    public static void main(String[] args) {
        /*
      和在示意图中一样,MoreUseful(更有用的)对 Useful(有用的)的接口进行了扩展。但由于它是继承来
的,所以也能上溯造型到一个 Useful。我们可看到这会在对数组 x(位于 main()中)进行初始化的时候发
生。由于数组中的两个对象都属于 Useful 类,所以可将 f()和 g()方法同时发给它们两个。而且假如试图调
用 u()(它只存在于 MoreUseful),就会收到一条编译期出错提示。
若想访问一个 MoreUseful 对象的扩展接口,可试着进行下溯造型。如果它是正确的类型,这一行动就会成
功。否则,就会得到一个 ClassCastException。我们不必为这个违例编写任何特殊的代码,因为它指出的是
一个可能在程序中任何地方发生的一个编程错误。
        */

        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();

//        x[1].u();//上溯后这样是不能访问的
        ((MoreUseful) x[1]).u();// Downcast/RTTI
        ((MoreUseful) x[0]).u();// Exception thrown

    }
}
