public class SplitTest {
    public static void main(String[] args) {
        // String str1 = "2|33|4|";
        // // String str1 = "2";
        // // String str1 = "|2|33|4|";
        // String[] str = str1.split("\\|");
        // for (int i = 0; i < str.length; i++) {
        // System.out.println(str[i]);
        // }

        // ""与" "
        if ("".equals(" ")) {
            System.out.println("\"\"与\" \"同");
        } else {
            System.out.println("\"\"与\" \"不同");
        }
        // 成员变量没有默认赋值，使用前先要赋值
        int intTest;
        intTest = 1;
        System.out.println(intTest);

        StringBuilder s = new StringBuilder("print what");
        System.out.println(s.toString());
    }
}
