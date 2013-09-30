package six;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午10:17
 * To change this template use File | Settings | File Templates.
 * 7.6 内部类
 */
public class Parcel2 {
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

        String readLabel() {
            return label;
        }
    }

    //一个外部类拥有一个特殊的方法,它会返回指向一个内部类的句柄。
    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents cont() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = cont();
        Destination d = to(dest);
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tanzania");

        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.cont();
        Parcel2.Destination d = q.to("Borneo");
    }
}
