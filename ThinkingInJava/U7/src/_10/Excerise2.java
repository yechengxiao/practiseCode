package _10;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-30
 * Time: 下午3:27
 * To change this template use File | Settings | File Templates.
 */
interface Rodent1 {
    void eat();

    void sleep();

    void run();
}

class Mouse1 implements Rodent1 {

    @Override
    public void eat() {
        System.out.println("Mouse1 est");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse1 sleep");
    }

    @Override
    public void run() {
        System.out.println("Mouse1 run");
    }
}

class Gerbil1 implements Rodent1 {

    @Override
    public void eat() {
        System.out.println("Gerbil1 est");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil1 sleep");
    }

    @Override
    public void run() {
        System.out.println("Gerbil1 run");
    }
}

class Hanster1 implements Rodent1 {
    @Override
    public void eat() {
        System.out.println("Hanster1 est");
    }

    @Override
    public void sleep() {
        System.out.println("Hanster1 sleep");
    }

    @Override
    public void run() {
        System.out.println("Hanster1 run");
    }
}

public class Excerise2 {
    public void action(Rodent1[] r) {

        for (int i = 0; i < r.length; i++) {
            r[i].eat();
            r[i].sleep();
            r[i].run();
        }
    }

    public static void main(String[] args) {
        Excerise2 e = new Excerise2();
        Rodent1[] r = {new Mouse1(), new Gerbil1(), new Hanster1()};

        e.action(r);

    }
}
