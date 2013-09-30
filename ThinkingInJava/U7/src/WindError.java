/**
 * User: ycx
 * Date: 13-9-27
 * Time: 下午2:17
 * 7.3 覆盖与过载
 */
class NoteX {
    public static final int MIDDLE_C = 0, C_SHARP = 1, C_FLAT = 2;
}

class InstrumentX {
    public void play(int NoteX) {
        System.out.println("InstrumentX.play()");
    }
}

class WindX extends InstrumentX {
//    public void play(NoteX noteX) {//这是overload，过载了，并非覆盖基类方法
//        System.out.println("Windx.play(NoteX n)");
//    }

    public void play(int x) {
        System.out.println("Windx.play()");
    }
}


public class WindError {
    public static void tune(InstrumentX instrumentX) {
        instrumentX.play(NoteX.MIDDLE_C);
    }

    public static void main(String[] args) {
        WindX flute = new WindX();
        tune(flute);
    }
}
