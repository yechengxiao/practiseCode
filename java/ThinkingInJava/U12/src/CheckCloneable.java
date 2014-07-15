/**
 * Created by yechengxiao on 14-3-19.
 * 总结了克隆的各种实现方法,然后在层次结构中将其“关闭”，其子类将没有clone能力
 */

/*
checking to see if a handle can be cloned
*/

/* can't clone this because it doesn't overriede clone() */
class Ordinary {
}

/* Overrides clone, but doesn't implement Cloneable */
class WrongClone extends Ordinary {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Does all the right things for cloning:
class IsCloneable extends Ordinary implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Turn off cloning by throwing the exception 关闭
class NoMore extends IsCloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

class TryMore extends NoMore {
    @Override
    public Object clone() throws CloneNotSupportedException {
        // calls NoMore.clone(), throws exception
        return super.clone();
    }
}

class BackOn extends NoMore {
    private BackOn duplicate(BackOn backOn) {
        return new BackOn();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // doesn't call NoMore.clone()
        return duplicate(this);
    }
}

// can't inherit from this, so can't override the clone method like in BackOn
final class ReallyNoMore extends NoMore {
}

public class CheckCloneable {
    static Ordinary tryToClone(Ordinary ordinary) {
        String id = ordinary.getClass().getName();
        Ordinary x = null;
        if (ordinary instanceof Cloneable) {
            try {
                System.out.println("Attempting " + id);
                x = (Ordinary) ((IsCloneable) ordinary).clone();
                System.out.println("Cloned " + id);
            } catch (Exception e) {
                System.out.println("Could not clone " + id);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        // upcasting
        Ordinary[] ordinaries = {
                new IsCloneable(),
                new WrongClone(),
                new NoMore(),
                new TryMore(),
                new BackOn(),
                new ReallyNoMore()
        };
        // Ordinary x = new Ordinary();
        /* this is won't compile, simple clone() is protected in Object: */
        for (int i = 0; i < ordinaries.length; i++) {
            tryToClone(ordinaries[i]);
        }
    }
}
