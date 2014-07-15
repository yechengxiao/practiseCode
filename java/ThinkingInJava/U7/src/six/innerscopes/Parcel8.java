package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午2:19
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 2   方法和作用域中的内部类
 */
public class Parcel8 {
    //由于它是匿名的,没有名字赋给构建器,所以我们不能拥有一个构建器。然而,我们可在定义自己的字段时进行初始化:
    //若想在匿名内部类外部定义的一个对象,则编译器要求外部对象为 final属性。

    public Destination dest(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Destination d = p.dest("test");
        System.out.println(d.readLabel());
    }
}
