/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-21
 * Time: 下午7:13
 * To change this template use File | Settings | File Templates.
 * 3.16 运算符总结
 */
public class AllOps {
    void f(boolean booelan) {

    }

    void boolTest(boolean x, boolean y) {
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x &= y;
        x ^= y;
        x |= y;
    }

    void charTest(char x, char y) {
        x = (char) (x * y);
        x = (char) (x / y);
        x = (char) (x % y);
        x = (char) (x + y);
        x = (char) (x - y);
        x++;
        x--;
        x = (char) +y;
        x = (char) -y;
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = (char) ~y;
        x = (char) (x & y);
        x = (char) (x | y);
        x = (char) (x ^ y);
        //移位运算
        x = (char) (x << 1);
        x = (char) (x >> 1);
        x = (char) (x >>> 1);
        //简写形式
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        //位运算符
        x &= y;
        x ^= y;
        x |= y;
        //casting 转型
        byte B = (byte) x;
        short s = (short) x;
        int i = x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void byteTest(byte x, byte y) {
        x = (byte) (x * y);
        x = (byte) (x / y);
        x = (byte) (x % y);
        x = (byte) (x + y);
        x = (byte) (x - y);
        x++;
        x--;
        x = (byte) +y;
        x = (byte) -y;
        f(x > y);
        f(x >= y);
        f(x <= y);
        f(x < y);
        f(x == y);
        f(x != y);

        x = (byte) ~y;
        x = (byte) (x & y);
        x = (byte) (x | y);
        x = (byte) (x ^ y);
        x = (byte) (x << 1);
        x = (byte) (x >> 1);
        x = (byte) (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= 1;
        x ^= 1;
        x |= 1;
        char c = (char) x;
        //......

    }
}
