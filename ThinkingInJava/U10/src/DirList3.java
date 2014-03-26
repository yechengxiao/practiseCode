import util.Echo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by yechengxiao on 14-3-5.
 */

// 使用匿名内部类实现
public class DirList3 {

    public static void main(final String[] args) {
        try {
            Echo.setIsDebug(false);

            File path = new File("..");
            String[] list;

            if (args.length == 0) {
                list = path.list();
            } else {
                Echo.echo("args.length != 0");

                list = path.list(new FilenameFilter() {
                    @Override
                    public boolean accept(File afr, String n) {
                        String f = new File(n).getName();
                        return f.indexOf(args[0]) != -1;
                    }
                });
            }

            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
