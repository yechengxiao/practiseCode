package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午1:58
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 2   方法和作用域中的内部类
 */
public class Parcel7 {
    public Wrapping wrap(int x) {
        return new Wrapping(x) {
            public int value() {
                //匿名类不能拥有一个构建器,这和在调用 super()时的常规做法不同
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrap(10);
        System.out.println(w.value());
    }
}
