package _extends;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-7-30
 * Time: 下午1:55
 * To change this template use File | Settings | File Templates.
 */
public abstract class ExtendsTestFather {
    String str = "father";

    public ExtendsTestFather() {
    }

    public void print() {
        System.out.println("it's father.");
    }

    public abstract void son_abstract();

}
