package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-22
 * Time: 下午7:02
 * To change this template use File | Settings | File Templates.
 * 3.4 练习1 打印出1～100的整数
 */
public class OutInt {
    public static void main(String[] args) {

        try {
            int i = 0;
            int[] numbers = new int[100];
            while (true) {
                if (i < 100) { //小心越界
                    numbers[i] = ++i;
                } else {
                    break;
                }
            }
            for (; i > 0; i--) { //小心越界
                if (i == 54) {//值为47则跳出
                    return;
                    //break;
                }
                System.out.println(numbers[100 - i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
