import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * 控制台输入xx xx，然后输出"xx":"xx",
 */
public class InputOutput {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner s = new Scanner(System.in);

            File dirFile = new File("D://ycx//Desktopout//out.txt");
            FileOutputStream outFile = new FileOutputStream(
                    "D://ycx//Desktop//out.txt");

            while (true) {
                String in = s.nextLine();
                String[] outs = in.split("\\s+");

                if (outs != null && outs.length > 0) {
                    String in1 = outs[0].trim();
                    String in2 = outs[outs.length - 1].trim();
                    // 输出并换行
                    String out = "\"" + in1.trim() + "\"" + ":" + "\""
                            + in2.trim() + "\"," + "\r\n";
                    // System.out.println(out);
                    byte[] b = out.getBytes();
                    outFile.write(b);

                    if (in1.equals("exit") || in2.equals("exit")) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("something wrong.");
            e.printStackTrace();
        }
    }
}
