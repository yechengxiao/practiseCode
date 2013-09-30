package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午12:03
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 2   方法和作用域中的内部类
 * 在任意作用域内嵌套一个内部类
 */
public class Parcel5 {
    private void internalTracking(boolean b) {
        if (b) {
            /*
             * TrackingSlip 类嵌套于一个 if 语句的作用域内。
             * 这并不意味着类是有条件创建的——它会随同其他所有东西得到编译。
             * 然而,在定义它的那个作用域之外,它是不可使用的。除这些以外,它看起来和一个普通类并没有什么区别。
             */
            class TrakingSlip {
                private String id;

                TrakingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }
            TrakingSlip ts = new TrakingSlip("slip");
            String s = ts.getSlip();
        }
        //out of scope
        //TrakingSlip ts = new TrakingSlip("slip");
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        p.track();
    }
}
