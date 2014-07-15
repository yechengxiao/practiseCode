package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
public class Parcel9 {
    //实际上,一个实例初始化模块就是一个匿名内部类的构建器。当然,它的功能是有限的;我们不能对实例初始化模块进行过载处理,所以只能拥有这些构建器的其中一个。
    public Destination dest(final String dest, final float price) {
        return new Destination() {
            private int cost;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("OVer budget");
                }
            }

            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.dest("Tanzania", 191.395F);

    }
}
