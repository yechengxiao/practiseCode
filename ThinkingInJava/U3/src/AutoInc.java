/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-20
 * Time: 下午8:23
 * To change this template use File | Settings | File Templates.
 */
//3.1.4节 自动递增/递减

public class AutoInc {
    private static void prt(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int i = 1;
        prt("i: " + i);
        prt("++i " + (++i));
        prt("i++ " + (i++));
        prt("i: " + i);
        prt("--i " + (--i));
        prt("i-- " + (i--));
        prt("i: " + i);
    }
}
