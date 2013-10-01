package seven;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-30
 * Time: 下午1:57
 * 7 . 7 . 2   继承和 f i n a l i z e ( )
 */
class DoBaseFinalization {
    public static boolean flag = false;
}

class Characteristic {
    String s;

    Characteristic(String c) {
        s = c;
        System.out.println("Creating Characteristic " + s);
    }

    protected void finalize() {
        System.out.println("finalizing Characteristic " + s);
    }
}

class LivingCreature {
    Characteristic p = new Characteristic("is alive");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void finalize() {
        System.out.println("LivingCreature finalize()");
        if (DoBaseFinalization.flag) {
            try {
                super.finalize();
            } catch (Throwable throwable) {

            }
        }
    }
}

class Animal extends LivingCreature {
    Characteristic p = new Characteristic("has heart");

    Animal() {
        System.out.println("Animal()");
    }

    protected void finalize() {
        System.out.println("Animal finalize");
        if (DoBaseFinalization.flag) {
            try {
                super.finalize();
            } catch (Exception e) {

            }
        }
    }
}

class Amphibian extends Animal {
    Characteristic p = new Characteristic("can live in water");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void finalize() {
        System.out.println("Amphibian finalize");
        if (DoBaseFinalization.flag) {
            try {
                super.finalize();
            } catch (Exception e) {

            }
        }
    }


}

public class Frog extends Amphibian {
    Frog() {
        System.out.println("Frog()");
    }

    protected void finalize() {
        System.out.println("Frog finalize");
        if (DoBaseFinalization.flag) {
            try {
                //覆盖衍生类的 finalize()时,务必记住调用 finalize()的基础类版本。否则,基础类的初始化根本不会发生。
                super.finalize();
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        if (args.length != 0 && args[0].equals("finalize")) {
            DoBaseFinalization.flag = true;
        } else {
            System.out.println("not finalizing bases");
        }
        new Frog();
        System.out.println("bye!");
        System.runFinalizersOnExit(true);
    }

}
