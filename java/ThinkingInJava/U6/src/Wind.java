/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 下午2:16
 * To change this template use File | Settings | File Templates.
 * 6.7 上溯造型
 */
class Instrument {
    public void play() {

    }

    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);//Upcasting
    }
}
