/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-21
 * Time: 下午8:24
 * To change this template use File | Settings | File Templates.
 * 3.2.5 for   逗号运算符
 */
public class CommaOperator {
    public static void main(String[] args) {
        //数据类型是相同的
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }

    }
}
