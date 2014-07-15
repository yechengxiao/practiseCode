/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-21
 * Time: 下午8:31
 * To change this template use File | Settings | File Templates.
 * 3.2.6 中断和继续
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                System.out.println("break");
                break;
            }
            if (i % 9 != 0) {
                //System.out.println("continue");
                continue;
            }
            System.out.println(i);
        }
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                System.out.println("break");
                break;
            }
            if (i % 10 != 0) {
                //System.out.println("continue");
                continue;
            }
            System.out.println(i);
        }
    }
}
