package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午11:50
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 2   方法和作用域中的内部类
 */
public class Parcel4 {
    /*
     * PDestination 类属于 dest()的一部分,而不是 Parcel4 的一部分(同时注意可为相同目录内每个类内部的一
     * 个内部类使用类标识符 PDestination,这样做不会发生命名的冲突)。
     * 因此,PDestination 不可从 dest()的外部访问。请注意在返回语句中发生的上溯造型——除了指向基础类 Destination 的一个句柄之外,没有
     * 任何东西超出 dest()的边界之外。
     * 当然,不能由于类 PDestination 的名字置于 dest()内部,就认为在dest()返回之后 PDestination 不是一个有效的对象。
     *
     * @param s
     * @return
     */
    public Destination dest(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
    }
}
