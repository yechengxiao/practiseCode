/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 上午10:43
 * To change this template use File | Settings | File Templates.
 * 6.2.1
 * 含有参数的构造函数
 */
class Game {
    Game(int i) {
        System.out.println("Game Constructor");
    }
}

class BoardGame extends Game {
    //父类中没有无参构造函数，下面这个构造函数无法使用
    /*BoardGame() {

    }*/

    BoardGame(int i) {
        super(i);//super()被显示的调用
        System.out.println("BoardGame Constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess Contructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
