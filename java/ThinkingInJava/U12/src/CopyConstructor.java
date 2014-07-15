/**
 * Created by yechengxiao on 14-3-19.
 * 12. 3. 1 副本构建器
 * A constructor for copying an object
 * of the same type, as an attempt to create a local copy.
 * 不懂了
 */
class FruitQualities {
    private int weight;
    private int color;
    private int firmness;
    private int ripeness;

    FruitQualities() {
    }

    FruitQualities(FruitQualities fruitQualities) {
        weight = fruitQualities.weight;
        color = fruitQualities.color;
        firmness = fruitQualities.firmness;
        ripeness = fruitQualities.ripeness;
    }
}

class Seed {
    Seed() {
    }

    Seed(Seed seed) {
    }
}

class Fruit {
    private FruitQualities fruitQualities;
    private int seeds;
    private Seed[] s;

    Fruit(FruitQualities q, int seedCount) {
        fruitQualities = q;
        seeds = seedCount;
        s = new Seed[seeds];
        for (int i = 0; i < seeds; i++) {
            s[i] = new Seed();
        }
    }

    Fruit(Fruit fruit) { // 注意这种
        // fruitQualities = fruit.fruitQualities; // 这样就是指向同一空间了
        fruitQualities = new FruitQualities(fruit.fruitQualities);
        seeds = fruit.seeds;
        for (int i = 0; i < seeds; i++) {
            s[i] = new Seed();
        }
    }

    protected void addQualities(FruitQualities q) {
        fruitQualities = q;
    }

    protected FruitQualities getQualities() {
        return fruitQualities;
    }
}

class Tomato extends Fruit {
    Tomato() {
        super(new FruitQualities(), 100);
    }

    Tomato(Tomato tomato) {
        super(tomato);
    }
}

class ZebraQualities extends FruitQualities {
    private int stripedness;

    ZebraQualities() {

    }

    ZebraQualities(ZebraQualities zebraQualities) {
        super(zebraQualities);
        stripedness = zebraQualities.stripedness;
    }
}

class GreenZebra extends Tomato {
    GreenZebra() {
        addQualities(new ZebraQualities());
    }

    GreenZebra(GreenZebra greenZebra) {
        super(greenZebra);
        addQualities(new ZebraQualities());
    }

    void evaluate() {
        ZebraQualities zq = (ZebraQualities) getQualities();
    }
}

public class CopyConstructor {
    public static void ripen(Tomato tomato) {
        tomato = new Tomato();
        System.out.println("In ripen, tomato is a " + tomato.getClass().getName());
    }

    public static void slice(Fruit fruit) {
        fruit = new Fruit(fruit);
        System.out.println("In slice, fruit is a " + fruit.getClass().getName());
    }

    public static void main(String[] args) {
        Tomato tomato = new Tomato();
        ripen(tomato);
        slice(tomato);
        GreenZebra g = new GreenZebra();
        ripen(g);
        slice(g);
        g.evaluate();
    }
}
