package util;

/**
 * Created by yechengxiao on 14-3-5.
 */
public class Echo {
    public static boolean isDebug = false;

    public static void setIsDebug(boolean isDebug) {
        Echo.isDebug = isDebug;
    }

    public static void echo(String str) {
        if (isDebug) {
            System.out.println(str);
        }
    }
}
