import java.util.Date;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-19
 * Time: 下午7:14
 * To change this template use File | Settings | File Templates.
 */
//2.7节

/**
 * The first Thinking in Java example program.
 * Lists system information on current machine.
 *
 * @author Bruce Eckel
 * @author http://www.BruceEckel.com
 * @version 1.0
 */
public class Property {
    /**
     * Sole entry point to class & application
     *
     * @param args array of string arguments
     * @return No return value
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);//debugging有用
        System.out.println("----Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = " + rt.totalMemory() + " Free Memory = " + rt.freeMemory());
        try {
            Thread.currentThread().sleep(5 * 1000);
        } catch (InterruptedException e) {

        }
    }

}
