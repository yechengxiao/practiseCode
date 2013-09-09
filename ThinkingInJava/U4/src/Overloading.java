/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-28
 * Time: 下午7:30
 * To change this template use File | Settings | File Templates.
 * 4.2 方法过载
 */
class Tree {
    int height;

    Tree() {
        prt("planting a seedling");
        height = 0;
    }

    Tree(int i) {
        prt("creating new Tree that is " + i + " feet tall");
        height = i;
    }

    void info() {
        prt("Tree is " + height + " feet tall");
    }

    void info(String s) {
        prt(s + ": tree is " + height + " feet tall");
    }

    static void prt(String s) {
        System.out.println(s);
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
