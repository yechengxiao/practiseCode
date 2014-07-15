package eight;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-30
 * Time: 下午2:37
 * To change this template use File | Settings | File Templates.
 * 7 . 8   通过继承进行设计
 */
interface Actor {
    void act();
}

class HappyActor implements Actor {
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor implements Actor {

    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    Actor a = new HappyActor();

    void change() {
        a = new SadActor();
    }

    void go() {
        a.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage s = new Stage();
        s.go();
        s.change();
        s.go();
    }

}
