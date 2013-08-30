package _extends;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-7-30
 * Time: 下午1:57
 * To change this template use File | Settings | File Templates.
 */
public class ExtendsTestSon extends ExtendsTestFather {
    String str = "son";

    public ExtendsTestSon() {
    }

    public static void main(String[] args) {
        ExtendsTestSon son = new ExtendsTestSon();
        son.print();
    }

    public void printSon() {
        System.out.println("it's son.");
    }

    public void print() {
        System.out.println("son override");
    }

    @Override
    public void son_abstract() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
