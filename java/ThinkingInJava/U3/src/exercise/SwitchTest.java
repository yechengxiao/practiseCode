package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-22
 * Time: 下午7:45
 * To change this template use File | Settings | File Templates.
 */
public class SwitchTest {
    public static void main(String[] args) {
        char c = 0;
        int j = 0;
        for (int i = 97; i < 123; i++) {
            c = (char) i;
            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    j++;
                    System.out.println("abc");
                    break;
                case 'd':
                case 'e':
                    j++;
                    System.out.println("de");
                    break;
                default:
                    System.out.println("f~z");
                    j++;
            }
        }
        System.out.println(j);
    }
}
