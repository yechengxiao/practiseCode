package five;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-27
 * Time: 下午3:27
 * To change this template use File | Settings | File Templates.
 * 7 . 5   接口
 */
interface Instrument5 {
    // Compile-time constant:
    int i = 5; // static & final

    // Cannot have method definitions:
    void play(); // Automatically public

    String what();

    void adjust();
}

class Wind5 implements Instrument5 {
    public void play() {
        System.out.println("five.Wind5.play()");
    }

    public String what() {
        return "five.Wind5";
    }

    public void adjust() {
    }
}

class Percussion5 implements Instrument5 {
    public void play() {
        System.out.println("five.Percussion5.play()");
    }

    public String what() {
        return "five.Percussion5";
    }

    public void adjust() {
    }
}

class Stringed5 implements Instrument5 {
    public void play() {
        System.out.println("five.Stringed5.play()");
    }

    public String what() {
        return "five.Stringed5";
    }

    public void adjust() {
    }
}

class Brass5 extends Wind5 {
    public void play() {
        System.out.println("five.Brass5.play()");
    }

    public void adjust() {
        System.out.println("five.Brass5.adjust()");
    }
}

class Woodwind5 extends Wind5 {
    public void play() {
        System.out.println("five.Woodwind5.play()");
    }

    public String what() {
        return "five.Woodwind5";
    }
}

public class Music5 {

    // Doesn't care about type, so new types

    // added to the system still work right:
    static void tune(Instrument5 i) {
        // ...
        i.play();
    }

    static void tuneAll(Instrument5[] e) {
        for (int i = 0; i < e.length; i++)
            tune(e[i]);
    }

    public static void main(String[] args) {
        Instrument5[] orchestra = new Instrument5[5];
        int i = 0;
        // Upcasting during addition to the array:
        orchestra[i++] = new Wind5();
        orchestra[i++] = new Percussion5();
        orchestra[i++] = new Stringed5();
        orchestra[i++] = new Brass5();
        orchestra[i++] = new Woodwind5();
        tuneAll(orchestra);
    }
}