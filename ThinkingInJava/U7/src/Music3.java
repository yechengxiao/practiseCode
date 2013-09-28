/**
 * User: ycx
 * Date: 13-9-27
 * Time: 上午11:00
 * 7.2.3 扩展性23
 */
class Instrument3 {
    public void play() {
        System.out.println("Instrument3.play()");
    }

    public String what() {
        return "Instrument3";
    }

    public void adjust() {
    }
}

class Wind3 extends Instrument3 {
    @Override
    public void play() {
        System.out.println("Wind3.play()");
    }

    @Override
    public String what() {
        return "Wind3";
    }

    @Override
    public void adjust() {
    }
}

class Percussion3 extends Instrument3 {
    @Override
    public void play() {
        System.out.println("Percussion3.play()");
    }

    @Override
    public String what() {
        return "Percussion3";
    }

    @Override
    public void adjust() {
    }
}

class Stringed3 extends Instrument3 {
    @Override
    public void play() {
        System.out.println("Stringed3.play()");
    }

    @Override
    public String what() {
        return "Stringed3";
    }

    @Override
    public void adjust() {
    }
}

class Brass3 extends Wind3 {//继承Wind3

    @Override
    public void play() {
        System.out.println("Brass3.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Brass3.adjust()");
    }
}

class Woodwind3 extends Wind3 {//继承Wind3

    @Override
    public void play() {
        System.out.println("Woodwind3.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Woodwind3.adjust()");
    }
}

public class Music3 {
    static void tune(Instrument3 i) {//这个方法可以  不变应万变
        i.play();
    }

    static void tuneAll(Instrument3[] e) {
        for (int i = 0; i < e.length; i++) {
            tune(e[i]);
        }
    }

    public static void main(String[] args) {
        Instrument3[] orchestra = new Instrument3[5];
        int i = 0;

        orchestra[i++] = new Wind3();
        orchestra[i++] = new Percussion3();
        orchestra[i++] = new Stringed3();
        orchestra[i++] = new Brass3();
        orchestra[i++] = new Woodwind3();

        tuneAll(orchestra);
    }
}
