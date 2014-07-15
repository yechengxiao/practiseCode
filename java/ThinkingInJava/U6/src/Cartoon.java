/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 上午10:30
 * To change this template use File | Settings | File Templates.
 * 6.2.1 基础类初始化  先初始化父类
 * 基础类会在衍生类访问它之前得到正确的初始化。
 * 这些构造函数是没有参数的
 */
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
//    Cartoon() {
//        System.out.println("Cartton constructor");
//    }

    public static void main(String[] args) {
        new Cartoon();
    }
}
