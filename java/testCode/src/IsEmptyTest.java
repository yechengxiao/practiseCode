/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-9
 * Time: 下午2:08
 * To change this template use File | Settings | File Templates.
 */
public class IsEmptyTest {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "   ";
        if (str1.isEmpty()) {
            System.out.println("\"" + "\"" + " isEmpty");
        }
        if (str2.trim().isEmpty()) {
            System.out.println("\"   " + "\".trim() " + " isEmpty");
        }
    }
}
