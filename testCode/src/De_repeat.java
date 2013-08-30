import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * User: ycx
 * Date: 13-7-31
 * Time: 上午9:26
 * 说明：去除List中重复的内容，保留原有顺序。
 */
public class De_repeat {
    static List repeatList;
    static int repeatInt;
    static long timeStart;

    {
        repeatList = new ArrayList();
        timeStart = System.currentTimeMillis();

        System.out.println("start init");
        for (int i = 0; i < 1000000; i++) {
            // repeatInt = (int) (Math.random() * 100);
            repeatList.add(2);
            repeatList.add(1);
        }
        System.out.println("success init" + "\n" + "before clear the repeatList.size() is "
                + repeatList.size());

    }

    public static void main(String[] args) {
        De_repeat d = new De_repeat();
        clear(repeatList);
        System.out.println("after clear the repeatList.size() is " + clear(repeatList).size()
                + "\n" + "spend time " + (System.currentTimeMillis() - timeStart) + "ms");

    }

    //去重
    public static List<Object> clear(List list) {
        return new ArrayList<Object>(new LinkedHashSet<Object>(list));
    }

}
