package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午12:11
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 2   方法和作用域中的内部类
 * 下面这个例子看起来有些奇怪:
 */
public class Parcel6 {
    public Contents cont() {
        /*
        匿名内部类的语法其实要表达的是:
        class MyContents extends Contents {
          private int i = 11;
          public int value() { return i; }
        }
        return new MyContents();
        */
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
    }
}
