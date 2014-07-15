import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-9-2
 * Time: 下午7:11
 * To change this template use File | Settings | File Templates.
 * 4.5.1 多维数组
 */
public class MultiDimArray {
    static Random rand = new Random();

    static int pRand(int mod) {
        return Math.abs(rand.nextInt() % mod + 1);
    }

    public static void main(String[] args) {
        int[][] a1 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                prt("a1[" + i + "][" + j + "] " + a1[i][j]);
            }
        }
        int[][][] a2 = new int[2][2][4];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                for (int k = 0; k < a2[i][j].length; k++) {
                    prt("a2[" + i + "][" + j + "][" + j + "] " + a2[i][j][k]);
                }
            }
        }
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
