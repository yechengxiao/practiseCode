/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-16
 * Time: 下午2:44
 * To change this template use File | Settings | File Templates.
 * 6.8.1 final数据
 */
class Value {
    int i = 1;
}

public class FinalData {
    //can be compile-time constants
    //编译期常数
    final int i1 = 9;
    static final int I2 = 99;

    //typical(典型的) public constant
    public static final int I3 = 39;

    //cannot be compile-time constant
    //运行期赋值
    //i4每次初始化都会赋值
    final int i4 = (int) (Math.random() * 20);
    //i5 static,值在载入时初始化,而非每创建一个对象时初始化。
    static final int i5 = (int) (Math.random() * 20);

    Value v1 = new Value();
    final Value v2 = new Value();
    static final Value v3 = new Value();
    //final Value v4;//需要初始化

    final int[] a = {1, 2, 3, 4, 5, 6};

    public void print(String id) {
        System.out.println(id + ": " + "i4=" + i4 + ", i5=" + i5);

    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData();
        //fd1.i1++;
        fd1.v2.i++;//句柄无法再指向另一个对象，但对象本身是可以修改的
        fd1.v1 = new Value();
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
        //fd1.v2 = new Value();//无法指向另一个对象
        //fd1.v3 = new Value();

        //fd1.a = new int[3];

        fd1.print("fd1");

        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData();
        fd1.print("fd1");
        fd2.print("fd2");

    }

}
