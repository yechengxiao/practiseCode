package six;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午3:38
 * To change this template use File | Settings | File Templates.
 * 7 . 6 . 5   引用外部类对象
 */
public class Parcel11 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readlabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel11 p = new Parcel11();
        //直接创建内部类的一个对象
        Parcel11.Contents c = p.new Contents();
        Parcel11.Destination d = p.new Destination("test");
    }

}
