package sort;

import java.util.Arrays;

/**
 *
 * 插入排序
 */
public class InsertSort {
    public static int[] demo01(int[] arr){
        int[] a = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > temp){
                a[j] = a[j - 1];
                j--;
            }
            if (i != j){
                a[j] = temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {5,1,3,6,99,7,8,2};
        int[] ints = demo01(a);
        for (int i : ints) {
            System.out.print(i+"\t");
        }
    }
}
