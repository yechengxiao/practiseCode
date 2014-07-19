/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 14-3-28
 * Time: 上午10:55
 * To change this template use File | Settings | File Templates.
 */
class Exception1 {
    public void throwEx() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch in throwEx");
            throw e;
        }
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            new Exception1().throwEx();
        } catch (Exception e) {
            System.out.println("catch in main");
        }
    }
}
