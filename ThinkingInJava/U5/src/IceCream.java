/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-9-6
 * Time: 下午9:29
 * To change this template use File | Settings | File Templates.
 * 5.2.3 private:不能接触!
 * <p/>
 * <p/>
 * 控制对象的创建方式,并防止有人直接访问一个特定的构建器(或者所有构建器)。在上面的例子中,我们不可通过它的构建器创建一个 Sundae 对象;相反,必须调用 makeASundae()方法来实现。
 * <p/>
 * <p/>
 * <p/>
 * 此时还会产生另一个影响:由于默认构建器是唯一获得定义的,而且它的属性是 private,所以可防止对这个类的继承(这是第 6 章要重点讲述的主题)。
 */
public class IceCream {
    public static void main(String[] args) {
        Sundae s = Sundae.makeASundae();
        //Sundae ss = new Sundae();//无法访问
    }
}

class Sundae {
    private Sundae() {

    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}
