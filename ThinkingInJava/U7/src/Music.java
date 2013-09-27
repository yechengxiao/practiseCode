/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-27
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 * u 7.1 上溯造型
 */
class Note {
    private int value;

    private Note(int val) {
        value = val;
    }

    public static final Note middleC = new Note(0), cSharp = new Note(1), cFlat = new Note(2);
}

class Instrument {//乐器

    public void play(Note note) {
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument {

    public void play(Note note) {
        System.out.println("wind.play()");
    }
}

public class Music {
    public static void tune(Instrument i) {//star  接收Instrument衍生类对象
        i.play(Note.middleC);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
