/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-9-2
 * Time: 下午7:32
 * To change this template use File | Settings | File Templates.
 * 4.7 练习
 */
public class Practise {
    static String str = new String();

    Practise() {
        prt("new Practise");
    }

    Practise(String s) {
        this.str = s;
        prt(str);
    }

    public static void main(String[] args) {
        Practise p1 = new Practise();
        //p1.prt("new Practise");
        Practise p2 = new Practise("new Practise(String s)");
        //p2.prt(str);
        Practise[] p3 = new Practise[4];
        for (int i = 0; i < p3.length; i++) {
            p3[i] = new Practise(" " + i);
        }


    }

    static void prt(String s) {
        System.out.println(s);
    }
}
