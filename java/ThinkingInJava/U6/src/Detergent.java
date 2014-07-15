/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 上午8:58
 * To change this template use File | Settings | File Templates.
 * U 6.2 继承
 */
class Cleanser {
    private String s = new String("Cleanser");

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public void print() {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        x.print();
    }
}

public class Detergent extends Cleanser {
    public void scrub() {//star
        append(" Detergent.scrub()");
        super.scrub();//调用父类方法
    }

    public void foam() {//子类扩展
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.print();
        System.out.println("Testing base class:");
        Cleanser.main(args);//star  直接可以调用
    }
}
