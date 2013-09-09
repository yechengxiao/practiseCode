/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-21
 * Time: 下午8:09
 * To change this template use File | Settings | File Templates.
 * 3.2.5 for
 */
public class ForTest {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {//输出一些字符
            if (c != 26) {
                System.out.println("value: " + (int) c + " character: " + c);
            }
        }
        System.out.println((int) 'a');//97
        System.out.println((int) 'A');//65
        System.out.println((char) 26);
        System.out.println("-------");
    }
}
