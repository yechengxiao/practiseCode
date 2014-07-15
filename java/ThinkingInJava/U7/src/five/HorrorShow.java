package five;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午8:43
 * To change this template use File | Settings | File Templates.
 * 7.5.2 通过继承扩展接口
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {//继承接口

    void destroy();
}

interface Lethal {
    void kil();
}

class DragonZilla implements DangerousMonster {

    @Override
    public void destroy() {

    }

    @Override
    public void menace() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster dangerousMonster) {
        dangerousMonster.menace();
        dangerousMonster.destroy();
    }

    public static void main(String[] args) {
        DragonZilla f2 = new DragonZilla();
        u(f2);
        v(f2);
    }
}
