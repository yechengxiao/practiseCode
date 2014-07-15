/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-20
 * Time: 下午9:11
 * To change this template use File | Settings | File Templates.
 */
//3.1.8小节 移位运算符
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        i >>>= 10;
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);


        System.out.println("---------------------------");
        int x = 0, y = 1, z = 2;
        String str = "string";
        System.out.println(str + x + y + z);//在String后面，处理方式不同。
        System.out.println(x + y + z + str);//在String前面

        System.out.println("---------------------------");
        boolean u = true, v = false;
        while (u = v) {//不会得到编译错误的时候是 x 和 y 都为布尔值。在这种情况下,x = y 属于合法表达式。
            System.out.println("is true");
        }

    }
}
