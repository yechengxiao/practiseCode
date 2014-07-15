package _10;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-30
 * Time: 下午3:14
 * To change this template use File | Settings | File Templates.
 */
class Rodent {
    protected void eat() {
    }

    protected void sleep() {
    }

    protected void run() {
    }
}

class Mouse extends Rodent {

    @Override
    protected void eat() {
        System.out.println("Mouse est");
    }

    @Override
    protected void sleep() {
        System.out.println("Mouse sleep");
    }

    @Override
    protected void run() {
        System.out.println("Mouse run");
    }
}

class Gerbil extends Rodent {

    @Override
    protected void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    protected void sleep() {
        System.out.println("Gerbil sleep");
    }

    @Override
    protected void run() {
        System.out.println("Gerbil run");
    }
}

class Hanster extends Rodent {

    @Override
    protected void eat() {
        System.out.println("Hanster eat");
    }

    @Override
    protected void sleep() {
        System.out.println("Hanster sleep");
    }

    @Override
    protected void run() {
        System.out.println("Hanster run");
    }
}

public class Excerise1 {

    public static void main(String[] args) {
        Rodent[] r = {new Mouse(), new Gerbil(), new Hanster()};
        r[0].eat();
        r[1].sleep();
        r[2].run();
    }

}
