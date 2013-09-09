/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-28
 * Time: 下午9:26
 * To change this template use File | Settings | File Templates.
 * 4.2.4 this  在构造方法中使用
 */
public class Flower {
    private int petalCount = 0;
    private String s = new String("null");

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only,petalCount=" + petals);

    }

    Flower(String ss) {
        System.out.println("Constructor w/ String arg only,ss=" + ss);
    }

    Flower(String s, int petals) {
        this(petals);
        //this(s);//不能在第二位
        this.s = s;
        System.out.println("String&int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void print() {
        //this(11);//不能在非构造方法中调用
        System.out.println("petalCount=" + petalCount + " s=" + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }

}
