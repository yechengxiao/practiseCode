package five;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 上午9:22
 * To change this template use File | Settings | File Templates.
 * 7.5.3 常数分组
 * 具有类型安全性
 * 它是一个 final 类,并含有一个 private 构建器,所以没有人能从它继承,或制作它的一个实例。
 */
public final class Month2 {//类无法继承
    private String name;

    private Month2(String nm) {//外部无法创建实例对象
        name = nm;
    }

    public String toString() {
        return name;
    }

    public final static Month2
            JAN = new Month2("January"),
            FEB = new Month2("February"),
            MAR = new Month2("March"),
            APR = new Month2("April"),
            MAY = new Month2("May"),
            JUN = new Month2("June"),
            JUL = new Month2("July"),
            AUG = new Month2("August"),
            SEP = new Month2("September"),
            OCT = new Month2("October"),
            NOV = new Month2("Nobember"),
            DEC = new Month2("December");

    public final static Month2[] moth = {JAN, JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};

    public static void main(String[] args) {
        Month2 m = Month2.JAN;
        System.out.println(m);

        m = Month2.moth[12];
        System.out.println(m);

        System.out.println(m == Month2.DEC);//true
        System.out.println(m.equals(Month2.DEC));//true
    }

}
