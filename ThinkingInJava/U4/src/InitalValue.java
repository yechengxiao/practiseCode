/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-29
 * Time: 下午8:48
 * To change this template use File | Settings | File Templates.
 * 4.4 成员初始化
 */
class Measurement {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String string;

    void print() {
        System.out.println("Data type Inital value\n" +
                "boolean " + t + "\n" +
                "char " + c + "\n" +
                "byte " + b + "\n" +
                "short " + s + "\n" +
                "int " + i + "\n" +
                "long " + l + "\n" +
                "float " + f + "\n" +
                "double " + d + "\n" +
                "String " + string + "\n");
    }
}

public class InitalValue {
    public static void main(String[] args) {
        new Measurement().print();
    }

}
