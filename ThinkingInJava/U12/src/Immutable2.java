/**
 * Created by yechengxiao on 14-3-19.
 * 12. 4. 2 “一成不变”的弊端
 */
class Mutable {
    private int data;

    public Mutable(int data) {
        this.data = data;
    }

    public Mutable add(int x) {
        data += x;
        return this;  // star
    }

    public Mutable multiply(int x) {
        data *= x;
        return this;
    }

    public Immutable2 makeImmutable2() {
        return new Immutable2(data);
    }
}

public class Immutable2 {
    private int data;

    public Immutable2(int initVal) {
        data = initVal;
    }

    public int read() {
        return data;
    }

    public boolean nonzero() {
        return data != 0;
    }

    public Immutable2 add(int x) {
        return new Immutable2(data + x);
    }

    public Immutable2 multiply(int x) {
        return new Immutable2(data *= x);
    }

    public Mutable makeMutable() {
        return new Mutable(data);
    }

    public static Immutable2 modify1(Immutable2 y) {
        Immutable2 val = y.add(12);
        val = val.multiply(3);
        val = val.add(11);
        val = val.multiply(2);
        return val;
    }

    public static Immutable2 modify2(Immutable2 y) {
        Mutable m = y.makeMutable();
        m.add(12).multiply(3).add(11).multiply(2);
        return m.makeImmutable2();
    }

    public static void main(String[] args) {
        Immutable2 i2 = new Immutable2(47);
        Immutable2 r1 = modify1(i2);
        Immutable2 r2 = modify2(i2);
        System.out.println();
    }
}
