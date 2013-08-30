package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//时间转换。
//时间加减时，单位都转到毫秒级。
public class Date2 {
	public static void main(String[] args) throws ParseException {
		System.out.println(new Date());
		// 设置时间格式
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		// 按照设置的格式设置时间
		String d1 = df.format(new Date());
		// 将时间转换为long，发布计算时间差
		Long d11 = Long.parseLong(d1);

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		System.out.println("d1: " + d1);
		System.out.println("d11: " + d11);

		System.out.println(c.getTime());
		// 设置时间
		Date sdf = new SimpleDateFormat("yyyy-MM-dd").parse("2008-07-08");
		Date sdf1 = new SimpleDateFormat("yyyy-MM-dd").parse("2008-08-08");
		// 通过Calendar获取时间
		c.setTime(sdf);
		Date date1 = c.getTime();
		c.setTime(sdf1);
		Date date2 = c.getTime();
		// 计算时间差
		long daterange = date2.getTime() - date1.getTime();
		long time = 1000 * 3600 * 24;
		long day1 = daterange / time;
		System.out.println("date1.getTime()" + date1.getTime()+"ms");
		System.out.println("date1:" + date1);
		System.out.println("daterange:" + daterange + "ms");
		System.out.println("相差" + day1 + "天");
		System.out.println("相差" + daterange / time / 30 + "个月");
	}
}