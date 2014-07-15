/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-8-21
 * Time: 下午12:59
 * To change this template use File | Settings | File Templates.
 * 替换大部分空白字符， 不限于空格
 * \r 回车 Carriage Return
 * \n 换行 New Line
 * \t tab
 */
public class Repalce {
    private static void prt(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String strTab = "\t";
        String strR = "\r";
        String strN = "\n";
        String str = "a\rb\nc\tdefg";
        prt("origin String is " + str);
        prt("new String is " + str.replaceAll("\\s*", ""));//替换大部分空白字符， 不限于空格


        String ss = "n1\n\nn2";
        String ss2 = "r1\rr2";//\r 怎么不显示r1
        String ss3 = "n1\n\rr1";
        String ss4 = "r1\r\nn1";//\r 这里又显示了r1
        prt(ss);
        prt("-----");
        prt(ss2);
        prt("-----");
        prt(ss3);
        prt("-----");
        prt(ss4);
        prt("-----");
    }
}
