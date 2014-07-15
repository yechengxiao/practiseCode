/**
 * Created with IntelliJ IDEA.
 * User: yechengxiao
 * Date: 13-8-22
 * Time: 下午6:29
 * To change this template use File | Settings | File Templates.
 * 3.2.7 switch
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            char c = (char) (Math.random() * 26 + 'a');//Math.random()=[0,1)的double     c=[a,z]   浮点转整形直接砍掉小数，不进位。
            System.out.println(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("sometines a wowel");
                    break;
                case 'z':
                    System.out.println("it's z");
                default:
                    System.out.println("sonsonant");

            }
        }
    }

}
