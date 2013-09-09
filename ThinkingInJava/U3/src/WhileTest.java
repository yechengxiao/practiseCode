/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-21
 * Time: 下午7:54
 * To change this template use File | Settings | File Templates.
 * 3.2.3 反复
 */
public class WhileTest {
    public static void main(String[] args) {
        int d = 0;
        while (d < 0.99d) {
            d = (int) (Math.random() * 100);
            System.out.println(d);
        }
    }
}
