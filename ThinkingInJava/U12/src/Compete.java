import java.io.*;

/**
 * Created by yechengxiao on 14-3-19.
 * 12.2.8 通过序列化进行深层复制
 * 对比序列化、clone的消耗时间
 * clone消耗时间少、更稳定
 */

class Thing1 implements Serializable {
}

class Thing2 implements Serializable {
    Thing1 o1 = new Thing1();
}

class Thing3 implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException c) {
            System.out.println("Thing3 can't clone");
        }
        return o;
    }
}

class Thing4 implements Cloneable {
    Thing3 o3 = new Thing3();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Thing4 o = null;
        try {
            o = (Thing4) super.clone();
        } catch (CloneNotSupportedException c) {
            System.out.println("Thing4 can't clone");
        }
        o.o3 = (Thing3) o3.clone();  // 对引用类型变量clone
        return o;
    }
}

public class Compete {
    static final int SIZE = 5000;

    public static void main(String[] args) {
        Thing2[] a = new Thing2[SIZE];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Thing2();
        }

        Thing4[] b = new Thing4[SIZE];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Thing4();
        }

        try {
            long t1 = System.currentTimeMillis();
            long t2;
            ByteArrayOutputStream buf = new ByteArrayOutputStream();
            ObjectOutputStream o = new ObjectOutputStream(buf);

            for (int i = 0; i < a.length; i++) {
                o.writeObject(a[i]);
            }
            // Now get copies:
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
            Thing2[] c = new Thing2[SIZE];
            for (int i = 0; i < c.length; i++) {
                c[i] = (Thing2) in.readObject();
            }
            t2 = System.currentTimeMillis();
            System.out.println("Duplication via serialization: " + (t2 - t1) + " Milliseconds");

            // Now try cloning
            t1 = System.currentTimeMillis();
            Thing4[] d = new Thing4[SIZE];
            for (int i = 0; i < d.length; i++) {
                d[i] = (Thing4) b[i].clone(); // 每个对象都要clone
            }
            t2 = System.currentTimeMillis();
            System.out.println("Duplication via Cloning: " + (t2 - t1) + " Milliseconds");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
