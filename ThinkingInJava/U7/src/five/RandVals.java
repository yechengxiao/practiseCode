package five;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午9:47
 * To change this template use File | Settings | File Templates.
 * 7.5.4 初始化接口中的字段
 */
public interface RandVals {
    int rint = (int) (Math.random() * 10);
    long rlong = (long) (Math.random() * 10);
    float rfloat = (float) (Math.random() * 10);
    double rdouble = Math.random() * 10;
}
