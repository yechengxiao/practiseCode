/**
 * Created by yechengxiao on 14-3-19.
 * 12.2.9 使克隆具有更大的深度
 */
// You can insert Cloneability at any  level of inheritance.
class Person {
}

class Hero extends Person {
}

//一旦在 Scientist 里添加了克隆能力,那么 Scientist 以及它的所有“后裔”都可以克隆。
class Scientist extends Person implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException c) {
            throw new InternalError();
        }
    }
}

class MadScientist extends Scientist {
}

public class HorrorFlick {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person();
        Hero h = new Hero();
        Scientist s = new Scientist();
        MadScientist m = new MadScientist();

//        p = (Person) p.clone(); // compile error
//        h = (Hero) h.clone();   // compile error
        s = (Scientist) s.clone();
        m = (MadScientist) m.clone();
    }
}
