/**
 * Created by yechengxiao on 14-3-6.
 */
// 无论如何，finally内代码都会执行

class SonOfException extends Exception {
}

// The finally clause is always executed
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new SonOfException();
                }
            } catch (SonOfException e) {
                System.out.println("check Exception thorwn is out ?");
            } catch (Exception e) {
                System.out.println("Exception thrown");
            } finally {
                System.out.println("in finally clause");
                if (count == 2) {
                    break; // out of "while"
                }
            }
        }
    }
}
