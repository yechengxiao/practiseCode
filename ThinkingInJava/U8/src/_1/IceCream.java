package _1;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 * 8 . 1 . 2   数组的返回
 */
public class IceCream {
    static String[] flav = {"Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mo Al Fu", "Rum Raisin", "Pr Cr", "Mud P"};//香料 Flavor

    static String[] flavorSet(int n) {
        // Force it to be positive & within bounds:
        n = Math.abs(n) % (flav.length + 1);//??

        String[] results = new String[n];
        int[] picks = new int[n];

        for (int i = 0; i < picks.length; i++) {
            picks[i] = -1;
        }
//        注意当 flavorSet()随机挑选香料的时候,它需要保证以前出现过的一次随机选择不会再次出
//        现。
//        为达到这个目的,它使用了一个无限 while 循环,不断地作出随机选择,直到发现未在 picks 数组里出
//        现过的一个元素为止(当然,也可以进行字串比较,检查随机选择是否在 results 数组里出现过,但字串比
//        较的效率比较低)。若成功,就添加这个元素,并中断循环(break),再查找下一个(i 值会递增)。
//        但假若 t 是一个已在 picks 里出现过的数组,就用标签式的 continue 往回跳两级,强制选择一个新 t。用一个调
//        试程序可以很清楚地看到这个过程。

        for (int i = 0; i < picks.length; i++) {//star
            retry:
            while (true) {
                int t = (int) (Math.random() * flav.length);//强制选择一个新t
                for (int j = 0; j < i; j++) {
                    if (picks[j] == t) {
                        continue retry;
                    }
                }
                picks[i] = t;
                results[i] = flav[t];
                break;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("flavorSet(" + i + ") =");

            String[] fl = flavorSet(flav.length);
            for (int j = 0; j < fl.length; j++) {
                System.out.println("\t" + fl[j]);
            }
        }
    }
}
