package seven;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-30
 * Time: 上午11:07
 * To change this template use File | Settings | File Templates.
 * Order of constructor calls
 */
class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwish extends PortableLunch {
    Bread d = new Bread();
    Cheese c = new Cheese();
    Lettuce i = new Lettuce();

    Sandwish() {
        System.out.println("Sandwish()");
    }

    public static void main(String[] args) {
        new Sandwish();
    }
}
