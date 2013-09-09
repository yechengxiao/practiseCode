import java.util.Random;

/**
 * User: yechengxiao
 * Date: 13-8-30
 * Time: 下午8:22
 * 4.5  数组初始化
 */
public class ArrayNew {
    static Random rand = new Random();

    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;//绝对值
        //prt(String.valueOf(Math.abs(Integer.MIN_VALUE)));//这样会输出负数
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[pRand(20)];
        Integer[] aa;//数组元素为对象，每个元素都要实例化
        aa = new Integer[pRand(20)];
        prt("length of aa= " + aa.length);
        for (int i = 0; i < aa.length; i++) {
            aa[i] = new Integer(pRand(500));
            prt("aa[" + i + "] " + aa[i]);
        }
        prt("length of a= " + a.length);
        for (int i = 0; i < a.length; i++) {
            prt("a[" + i + "] " + a[i]);
        }

        Integer[] b = new Integer[]{new Integer(1), new Integer(2),};//这样也可以初始化，就是数组大小限定了。逗号可留可去。

    }

    static void prt(String s) {
        System.out.println(s);
    }

}
