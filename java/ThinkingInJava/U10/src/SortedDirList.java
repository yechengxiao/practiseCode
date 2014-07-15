import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by yechengxiao on 14-3-5.
 */
public class SortedDirList {
    private File path;
    private String[] list;

    public SortedDirList(final String afn) {
        path = new File(".");
        if (afn == null) {
            list = path.list();
        } else {
            list = path.list(new FilenameFilter() {
                @Override
                public boolean accept(File file, String s) {
                    String f = new File(s).getName();
                    return f.indexOf(f) != -1;
                }
            });
        }
        sort();
    }

    void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private void sort() {
        java.util.Arrays.sort(list);  // 排序
    }

    public static void main(String[] args) {
        SortedDirList sd;
        if (args.length == 0) {
            sd = new SortedDirList(null);
        } else {
            sd = new SortedDirList(args[0]);
            sd.print();
        }
    }
}
