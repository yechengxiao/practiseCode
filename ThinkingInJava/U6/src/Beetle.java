/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 下午3:49
 * To change this template use File | Settings | File Templates.
 * 6.9.1 继承初始化
 * <p/>
 * static 成员变量先被载入/
 */

/**
 * 对 Beetle 运行 Java 时,发生的第一件事情是装载程序到外面找到那个类。在装载过程中,装载程序注意它
 * 有一个基础类(即 extends 关键字要表达的意思),所以随之将其载入。无论是否准备生成那个基础类的一
 * 个对象,这个过程都会发生(请试着将对象的创建代码当作注释标注出来,自己去证实)。
 * 若基础类含有另一个基础类,则另一个基础类随即也会载入,以此类推。接下来,会在根基础类(此时是
 * Insect)执行 static 初始化,再在下一个衍生类执行,以此类推。保证这个顺序是非常关键的,因为衍生类
 * 的初始化可能要依赖于对基础类成员的正确初始化。
 * 此时,必要的类已全部装载完毕,所以能够创建对象。首先,这个对象中的所有基本数据类型都会设成它们
 * 的默认值,而将对象句柄设为 null 。随后会调用基础类构建器。在这种情况下,调用是自动进行的。但也完
 * 全可以用 super 来自行指定构建器调用(就象在 Beetle()构建器中的第一个操作一样)。基础类的构建采用
 * 与衍生类构建器完全相同的处理过程。基础顺构建器完成以后,实例变量会按本来的顺序得以初始化。最
 * 后,执行构建器剩余的主体部分。
 */
class Insect {
    int i = 9;
    int j;

    Insect() {
        prt("i = " + i + ", j = " + j);
        j = 39;
    }

    static int x1 = prt("static Insect.x1 initialized");

    static int prt(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    int k = prt("Beetle.k initialized");

    Beetle() {
        prt("k= " + k);
        prt("j= " + j);
    }

    static int x2 = prt("static Beetle.x2 initialized");

    static int prt(String s) {
        System.out.println(s);
        return 63;
    }

    public static void main(String[] args) {
        prt("Beetle constructor");
        Beetle b = new Beetle();
    }
}
