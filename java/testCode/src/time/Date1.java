package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SimpleDateFormat sdfRq = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfSj = new SimpleDateFormat("HHmmss");

        System.currentTimeMillis();//当前时间，毫秒

        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        String rq = sdfRq.format(date);
        String sj = sdfSj.format(date);

        System.out.println(rq + "\t" + sj + "\t" + date);
    }
}
