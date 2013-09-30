package five;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午8:26
 * To change this template use File | Settings | File Templates.
 * 7.5.1 Java的“多重继承”
 */
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {//与接口CanFight方法同名，Hero中不用实现fight()

    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

public class Adventure {
    static void t(CanFight x) {
        x.fight();
    }

    static void u(CanSwim x) {
        x.swim();
    }

    static void v(CanFly x) {
        x.fly();
    }

    static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero i = new Hero();
        t(i);//上溯造型
        u(i);
        v(i);
        w(i);
    }
}
