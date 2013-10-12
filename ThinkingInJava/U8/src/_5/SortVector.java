package _5;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-10-10
 * Time: 下午2:38
 * To change this template use File | Settings | File Templates.
 */
public class SortVector extends Vector {
    private Compare compare;

    public SortVector(Compare compare) {
        this.compare = compare;
    }

    public void sort() {
        quickSort(0, size() - 1);
    }

    private void quickSort(int left, int right) {
        if (right > left) {
            Object o1 = elementAt(right);
            int i = left - 1;
            int j = right;
            while (true) {
                while (compare.lessThan(elementAt(++i), o1)) ;
                while (j > 0) {
                    if (compare.lessThanOrEqual(elementAt(--j), o1)) {
                        break;
                    }
                }
                if (i >= j) {
                    break;
                }
                swap(i, j);
            }
            swap(i, right);
            quickSort(left, i - 1);
            quickSort(i + 1, right);
        }
    }

    private void swap(int loc1, int loc2) {
        Object tmp = elementAt(loc1);
        setElementAt(elementAt(loc2), loc1);
        setElementAt(tmp, loc2);
    }
}
