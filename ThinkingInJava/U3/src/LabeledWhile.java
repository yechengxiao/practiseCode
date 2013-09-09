/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-21
 * Time: 下午9:13
 * To change this template use File | Settings | File Templates.
 * 3.2.6 中断和继续 标签
 */
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;

        outer:
        while (true) {
            prt("outer while loop");
            while (true) {
                i++;
                prt("i= " +i);
                if (i == 1) {
                    prt("continue");
                    continue;
                }
                if (i == 3) {
                    prt("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    prt("break");
                    break;
                }
                if (i == 8) {
                    prt("break outer");
                    break outer;
                }
            }
        }

    }

    private static void prt(String s) {
        System.out.println(s);
    }
}
