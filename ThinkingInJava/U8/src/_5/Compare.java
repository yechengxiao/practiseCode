package _5;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-10
 * Time: 下午2:36
 * To change this template use File | Settings | File Templates.
 */
public interface Compare {
    //对这两种方法来说,lhs 代表本次比较中的“左手”对象,而 rhs 代表“右手”对象。
    boolean lessThan(Object lhs, Object rhs);

    boolean lessThanOrEqual(Object lhs, Object rhs);
}
