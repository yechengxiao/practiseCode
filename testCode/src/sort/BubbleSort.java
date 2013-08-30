package sort;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: ycx
 * Date: 13-7-29
 * Time: 下午12:25
 * To change this template use File | Settings | File Templates.
 * 一些排序算法
 */
public class BubbleSort implements Comparator {
    //冒泡
//    public static void main(String[] args) {
//        sort.BubbleSort bs = new sort.BubbleSort();
//        int[] nums = {3, 8, 5, 0, 2, 4, 9};
//        bs.sort(nums);
//        System.out.println("sorted");
//        for (long l : nums) {
//            System.out.print(l + " ");
//        }
//    }

    //    //插入
//    public static void main(String[] args) {
//        Comparable[] c = {4, 9, 23, 1, 45, 27, 5, 2};
//        insertionSort(c);
//        for (int i = 0; i < c.length; i++)
//            System.out.println("插入排序：" + c[i]);
//    }
    //二分
    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 0, 2, 4, 9};
        int[] sorted = binarySort(nums);
        for (int out : sorted) {
            System.out.println(out);
        }

    }

    //    public static void main(String[] args) {
//        String[] array = new String[]{"一二", "三", "二"};
//        Arrays.sort(array, new sort.BubbleSort());
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }

    //二分查找排序
    public static int[] binarySort(int[] data) {
        int[] temp = new int[data.length];
        for (int i = 0; i < temp.length; i++) {
            if (i == 0) {
                temp[i] = data[i];
            } else {
                for (int j = 0, k = i - 1; j < i && k >= 0; ) {
                    if (temp[(j + k) / 2] >= data[i]) {
                        if ((j + k) / 2 == 0) {
                            for (int iter = i; iter > 0; iter--) {
                                temp[iter] = temp[iter - 1];
                            }
                            temp[0] = data[i];
                            break;
                        } else if (temp[(j + k) / 2 - 1] <= data[i]) {
                            for (int iter = i; iter > (j + k) / 2; iter--) {
                                temp[iter] = temp[iter - 1];
                            }
                            temp[(j + k) / 2] = data[i];
                            break;
                        } else {
                            k = (k + j) / 2 - 1;
                        }
                    } else if (temp[(j + k) / 2] < data[i]) {
                        if ((j + k) / 2 == i - 1) {
                            temp[i] = data[i];
                            break;
                        } else {
                            j = (k + j) / 2 + 1;
                        }
                    }
                }
            }
        }
        return temp;
    }

    //插入排序
    public static void insertionSort(Comparable[] data) {
        for (int index = 1; index < data.length; index++) {
            Comparable key = data[index];
            int position = index;
            //shift larger values to the right
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }
            data[position] = key;
        }
    }

    //冒泡排序
    public void sort(int[] a) {
        for (int aa : a) {
            System.out.print(aa + " ");
        }
        System.out.println("\n" + "sorting");
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    for (int out : a) {
                        System.out.print(out + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("-----------------");

        }
    }

    //需要实现的方法
    public int compare(Object o1, Object o2) {
        return toInt(o1) - toInt(o2);
    }

    private int toInt(Object o) {
        String str = (String) o;
        str = str.replaceAll("一", "1");
        str = str.replaceAll("二", "2");
        str = str.replaceAll("三", "3");
        //
        return Integer.parseInt(str);
    }
}