/**
 * User: yechengxiao
 * Date: 13-8-30
 * Time: 下午8:15
 * 4.5  数组初始化
 */
public class Arrays {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i]++;//数组a1也受影响
        }
        for (int i = 0; i < a2.length; i++) {
            System.out.println("a1[" + i + "] " + a1[i]);
        }
    }
}
