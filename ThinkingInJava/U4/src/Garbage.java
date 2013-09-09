/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-29
 * Time: 下午7:45
 * To change this template use File | Settings | File Templates.
 * 4.3.2 必须执行清理 finalize()观察垃圾收集的过程，尽量避免使用。
 * 程序有点问题
 */
class Chair {
    static boolean gcrun = false;
    static boolean f = false;
    static int created = 0;
    static int finalized = 0;
    int i;

    Chair() {
        i = ++created;
        if (created == 47)
            System.out.println("Created 47");
    }

    protected void finalize() {//不能准确知道垃圾收集器何时启动
        if (!gcrun) {
            gcrun = true;
            System.out.println(
                    "Beginning to finalize after " +
                            created + " Chairs have been created");
        }
//        if (i == 47) {
        System.out.println(
                "Finalizing Chair #47, " +
                        "Setting flag to stop Chair creation");
        f = true;
//        }
        finalized++;
        if (finalized >= created)
            System.out.println("All " + finalized + " finalized");
    }
}

public class Garbage {
    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.err.println("Usage: \n" +
//                    "java Garbage before\n  or:\n" +
//                    "java Garbage after");
//            return;
//        }
        while (!Chair.f) {
            new Chair();
            new String("To take up space");
        }
        System.out.println(
                "After all Chairs have been created:\n" +
                        "total created = " + Chair.created +
                        ", total finalized = " + Chair.finalized);
//        if (args[0].equals("before")) {
        System.out.println("gc():");
        System.gc();//强制执行垃圾收集器
        System.out.println("runFinalization():");
        System.runFinalization();//便于收尾工作
//        }
        System.out.println("bye!");
//        if (args[0].equals("after"))
        System.runFinalizersOnExit(true);
    }
}
