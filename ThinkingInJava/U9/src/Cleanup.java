import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yechengxiao on 14-3-6.
 */
// Paying attention to exceptions
// in constructors
// 构造函数中出现异常如何搞定？
class InputFile {
    private BufferedReader in;

    InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname)); // 读取文件
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            // Wasn't open, so don't close it
            throw e;   // 抛出异常，调用方可以将其捕获
        } catch (Exception e) {
            // All other exceptions must close it
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;   // 抛出异常，调用方可以将其捕获
        } finally {
            // Don't close it here!!!
        }
    }

    String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            System.out.println("readLine() unsuccessful");
            s = "failed";
        }
        return s;
    }

    void cleanup() {
        try {
            in.close();
        } catch (IOException e2) {
            System.out.println("in.close() unsuccessful");
        }
    }
}

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("./Cleanup.java");
            String s;
            int i = 1;
            while ((s = in.getLine()) != null) {
                System.out.println("" + i++ + ":" + s);
            }
            in.cleanup();
        } catch (Exception e) {
            System.out.println("Caught in main, e.printStackTrace()");
            e.printStackTrace();
        }
    }
}
