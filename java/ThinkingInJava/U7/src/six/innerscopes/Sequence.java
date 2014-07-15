package six.innerscopes;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-9-29
 * Time: 下午2:46
 * To change this template use File | Settings | File Templates.
 * 7.6.3 链接到外部类
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] o;
    private int next = 0;

    public Sequence(int size) {
        this.o = new Object[size];//这里实例化
    }

    public void add(Object x) {//这里添加
        if (next < o.length) {
            o[next] = x;
            next++;
        }
    }

    private class SSelecotr implements Selector {
        int i = 0;

        //一个方法一个功能
        @Override
        public boolean end() {
            return i == o.length;
        }

        @Override
        public Object current() {
            return o[i];
        }

        @Override
        public void next() {
            if (i < o.length) {
                i++;
            }
        }
    }

    public Selector getSelector() {
        return new SSelecotr();//上溯造型
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            s.add(Integer.toString(i));
        }
        Selector sl = s.getSelector();
        while (!sl.end()) {
            System.out.println((String) sl.current());
            sl.next();
        }
    }

}
