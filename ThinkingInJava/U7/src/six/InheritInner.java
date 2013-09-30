package six;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午3:55
 * To change this template use File | Settings | File Templates.
 * 7.6.6 从内部类继承
 */
class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {//从内部类继承

    public InheritInner(WithInner withInner) {
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
