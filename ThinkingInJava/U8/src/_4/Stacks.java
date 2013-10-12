package _4;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-8
 * Time: 下午4:08
 * To change this template use File | Settings | File Templates.
 * 8 . 4 . 3   S t a c k
 * LIFO
 */
public class Stacks {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "Auguse", "September", "Octor", "November", "Decmber"};

    public static void main(String[] args) {
        Stack stk = new Stack();
        for (int i = 0; i < months.length; i++) {
            stk.push(months[i] + " ");//加入
        }
        System.out.println("stk=" + stk);

        stk.addElement("The last line");
        System.out.println("element 5 = " + stk.elementAt(5));
        System.out.println(" popping elements:");
        while (!stk.empty()) {
            System.out.println(stk.pop());//取出
        }
    }

}
