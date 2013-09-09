/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-21
 * Time: 下午8:53
 * To change this template use File | Settings | File Templates.
 * 3.2.6 中断和继续 标签
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
//can't have statement here
        for (; true; ) {
            prt("outer");
            inner:
            for (; i < 10; i++) {
                prt("i= " + i);
                if (i == 1) {
                    prt("continue");
                    continue;
                }
                if (i == 3) {
                    prt("break");
                    i++;
                    break;
                }
                if (i == 8) {
                    prt("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        prt("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }

    private static void prt(String s) {
        System.out.println(s);
    }
}
