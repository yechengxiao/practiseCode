/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 上午10:58
 * To change this template use File | Settings | File Templates.
 * 6.3 合成与集成的结合
 */
class Plate {
    Plate(int i) {
        System.out.println("Plate constructor" + i);
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor" + i);
    }
}

class Utensi {
    Utensi(int i) {
        System.out.println("Utensi constructor" + i);
    }
}

class Spoon extends Utensi {
    Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor" + i);
    }
}

class Fork extends Utensi {
    Fork(int i) {
        super(i);
        System.out.println("Fork constructor" + i);
    }
}

class Knife extends Utensi {
    Knife(int i) {
        super(i);
        System.out.println("Knife constructor" + i);
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Custom constructor" + i);
    }
}

public class PlaceSetting extends Custom {
    Spoon sp;
    Fork frk;
    Knife kn;
    DinnerPlate pl;

    PlaceSetting(int i) {//初始化引用数据类型
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(0);
    }

}
