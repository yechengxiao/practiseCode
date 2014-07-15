/**
 * User: ycx
 * Date: 13-9-27
 * Time: 下午2:40
 * 7.4 抽象类和方法
 */
abstract class Instrement4 {
    int i;

    public abstract void play();

    public String what() {
        return "Instrument4";
    }

    public abstract void adjust();
}

class Wind4 extends Instrement4 {

    @Override
    public void play() {
        System.out.println("Wind4.play()");
    }

    @Override
    public String what() {
        return "Wind4";
    }

    @Override
    public void adjust() {

    }
}

class Percussion4 extends Instrement4 {
    @Override
    public void play() {
        System.out.println("Percussion4.play()");
    }

    @Override
    public String what() {
        return "Percussion4";
    }

    @Override
    public void adjust() {

    }
}

class Stringed4 extends Instrement4 {
    @Override
    public void play() {
        System.out.println("Stringed4.play()");
    }

    @Override
    public String what() {
        return "Strnged4";
    }

    @Override
    public void adjust() {

    }
}

class Brass4 extends Wind4 {
    @Override
    public void play() {
        System.out.println("Brass4.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Brass4.adjust()");
    }
}

class Woodwind4 extends Wind4 {
    @Override
    public void play() {
        System.out.println("Woodwind4.play()");
    }

    @Override
    public String what() {
        return "Woodwind4";
    }
}

public class Music4 {
    static void tune(Instrement4 i) {
        i.play();
    }

    static void tuneAll(Instrement4[] e) {
        for (int i = 0; i < e.length; i++) {
            tune(e[i]);
        }
    }

    public static void main(String[] args) {
        Instrement4[] orchestra = new Instrement4[5];
        int i = 0;

        orchestra[i++] = new Wind4();
        orchestra[i++] = new Percussion4();
        orchestra[i++] = new Stringed4();
        orchestra[i++] = new Brass4();
        orchestra[i++] = new Woodwind4();

        tuneAll(orchestra);
    }
}
