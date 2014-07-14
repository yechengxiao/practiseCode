import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by yechengxiao on 14-3-5.
 */

// 使用匿名内部类实现
public class DirList2 {
    public static FilenameFilter filter(final String afn) {  // 在匿名内部类中使用，需要final
        // 创建匿名内部类
        return new FilenameFilter() {
            String fn = afn;

            @Override
            public boolean accept(File file, String s) {
                String f = new File(s).getName();
                return f.indexOf(fn) != -1;
            }
        };
    }

    public static void main(String[] args) {
        try {
            File path = new File("/home");
            String[] list;

            if (args.length == 0) {
                list = path.list();
            } else {
                list = path.list(filter(args[0]));
            }

            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
