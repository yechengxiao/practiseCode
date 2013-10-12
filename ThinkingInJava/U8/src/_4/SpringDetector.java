package _4;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-10
 * Time: 下午2:13
 * To change this template use File | Settings | File Templates.
 * 1. 创建“关键”类
 */
class Groundhog {//土拔鼠
    int ghNumber;

    Groundhog(int n) {
        ghNumber = n;
    }

    @Override
    public int hashCode() {
        return ghNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Groundhog && (ghNumber == ((Groundhog) obj).ghNumber));
    }
}

class Prediction {
    boolean shadow = Math.random() > 0.5;

    @Override
    public String toString() {
        if (shadow) {
            return "Six more weeks of Winter!";
        } else {
            return "Early Spring!";
        }
    }
}

public class SpringDetector {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        for (int i = 0; i < 10; i++) {
            ht.put(new Groundhog(i), new Prediction());
        }

        System.out.println("ht = " + ht + "\n");
        System.out.println("Looking up predicton for groundhog #3: ");

        Groundhog gh = new Groundhog(9);
        if (ht.containsKey(gh)) {
            System.out.println((Prediction) ht.get(gh));
        }
    }
}
