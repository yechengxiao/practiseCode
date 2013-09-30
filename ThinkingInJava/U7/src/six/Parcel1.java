package six;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午10:09
 * To change this template use File | Settings | File Templates.
 * 7.6 内部类
 */
public class Parcel1 {
    class Contents {//内部类
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {//内部类
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tanzania");
    }

}
