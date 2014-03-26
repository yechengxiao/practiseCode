/**
 * Created by yechengxiao on 14-3-6.
 */

// Overridden methods may throw only the
// exceptions specified in their base-class
// versions, or exceptions derived from the
// base-class exceptions.

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    protected Inning() throws BaseballException {
    }

    void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }

    abstract void atBat() throws Strike, Foul;

    //Throws nothing
    void walk() {

    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {

}

interface Storm {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}

public class StormyInning implements Storm {
    // OK to add new exceptions for constructors,
    // but you must deal with the base constructor
    // exceptions
    StormyInning() throws RainedOut, BaseballException {
    }

    StormyInning(String s) throws Foul, BaseballException {
    }

    @Override
    public void event() throws RainedOut {  // 进行覆盖的时候，异常遵循继承特性

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    void atBat() throws PopFoul {

    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
        } catch (RainedOut e) {
        } catch (BaseballException e) {
        }
//        try {
//            // What happens if you upcast?
//            Inning i = new StormyInning();
//            i.atBat();
//        } catch (Strike strike) {
//        } catch (Foul e) {
//        } catch (RainedOut e) {
//        } catch (BaseballException e) {
//        }
    }
}
