/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 下午3:14
 * To change this template use File | Settings | File Templates.
 * 6.8.1 空白final
 */
class Poppet {

}

public class BlankFinal {
    final int i = 0;
    final int j;//在构造函数中，有选择的初始化
    final Poppet p;

    BlankFinal() {
        j = 1;
        p = new Poppet();
    }

    BlankFinal(int x) {
        j = x;
        p = new Poppet();
    }

    public static void main(String[] args) {
        BlankFinal bf = new BlankFinal();
    }

}
