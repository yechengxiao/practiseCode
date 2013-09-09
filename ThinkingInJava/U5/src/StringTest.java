/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-9-6
 * Time: 下午8:36
 * To change this template use File | Settings | File Templates.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = new String("test");
        s.substring(0, 2);
        System.out.println(s);

        StringBuffer strBuf = new StringBuffer("stringBuffer");
        strBuf.append(" append");
        System.out.println(strBuf);
        strBuf.substring(0, 2);//返回一个新的String
        System.out.println(strBuf);
    }
}
