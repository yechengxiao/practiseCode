package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午3:24
 * To change this template use File | Settings | File Templates.
 * 7.6.4 static 内部类
 */
abstract class Contents1 {
    abstract public int value();
}

interface Destination1 {
    String readLabel();
}

public class Parcel10 {

    private static class PContents extends Contents1 {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected static class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public static Destination dest(String s) {
        return new PDestination(s);
    }

    public static Contents1 cont() {
        return new PContents();
    }

    public static void main(String[] args) {
        //非static内部类，使用封装类来实例化内部类

        //static内部类，不需要外部类对象 Parcel2.java
        Contents1 c = cont();
        Destination d = dest("test");
    }
}
