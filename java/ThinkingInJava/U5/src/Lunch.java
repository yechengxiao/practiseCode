/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-9-6
 * Time: 下午10:14
 * To change this template use File | Settings | File Templates.
 * 5.4 类访问
 */
class Soup {
    private Soup() {

    }

    public static Soup makeSoup() {
        return new Soup();
    }

    private static Soup sp1 = new Soup();//独子

    public static Soup access() {
        return sp1;
    }

    public void f() {

    }

}

class Sandwich {
    void f() {
        new Lunch();
    }
}

public class Lunch {
    public static void main(String[] args) {

    }

    void test() {
        //Soup priv1=new Soup();//权限不够
        Soup priv2 = Soup.access();
        Sandwich f1 = new Sandwich();
        Soup.access().f();
    }
}
