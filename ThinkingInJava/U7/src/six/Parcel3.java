package six;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午10:36
 * To change this template use File | Settings | File Templates.
 * 7.6.1 内部类和上溯造型
 */
abstract class Contents {
    abstract public int value();
}

interface Destination {
    String readlabel();
}

public class Parcel3 {
    private class PContents extends Contents {//隐藏了具体的实现
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readlabel() {
            return label;
        }
    }

    public Destination dest(String s) {
        return new PDestination(s);
    }

    public Contents cont() {
        return new PContents();
    }
}

class Test {
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.cont();//上溯造型
        Destination d = p.dest("Tanzania");
        c.value();
        d.readlabel();

        Parcel3.PDestination pd = (Parcel3.PDestination) p.dest("test");
        //private 无法访问private class
        //Parcel3.PContents c=p.new PContents();
    }
}