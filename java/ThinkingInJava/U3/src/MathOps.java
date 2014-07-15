import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-20
 * Time: 下午7:51
 * To change this template use File | Settings | File Templates.
 */
//3.1.3节 算术运算符
public class MathOps {
    static void prt(String s) {
        System.out.println(s);
    }

    static void pInt(String s, int i) {
        prt(s + " = " + i);
    }

    static void pFlt(String s, float f) {
        prt(s + " = " + f);
    }

    public static void main(String[] args) {
        Random rand = new Random();//生产随机数
        int i, j, k;
        j = rand.nextInt() % 100;//注意
        k = rand.nextInt() % 100;

        pInt("j", j);
        pInt("k", k);
        i = j + k;
        pInt("j+k ", i);
        i = j - k;
        pInt("j-k ", i);
        i = k / j;
        pInt("k/j ", i);
        i = k * j;
        pInt("k*j ", i);
        i = k % j;
        pInt("k%j ", i);

        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();

        pFlt("v ", v);
        pFlt("w ", w);
        u = v + w;
        pFlt("v+w ", u);
        u = v - w;
        pFlt("v-w ", u);
        u = v * w;
        pFlt("v*w ", u);
        u = v / w;
        pFlt("v/w ", u);

        u += v;
        pFlt("u+=v ", u);
        u -= v;
        pFlt("u-=v ", u);
        u *= v;
        pFlt("u*=v ", u);
        u /= v;
        pFlt("u/=v ", u);

    }

}
