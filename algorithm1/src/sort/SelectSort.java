package sort;

import java.util.Arrays;

/**
 *
 * 选择排序
 */
public class SelectSort {
public static int[] demo01(int[] arr){
    int[] a = Arrays.copyOf(arr,arr.length);

    for(int i = 0; i < a.length - 1; i++){
        int min = i;
        for(int j = i + 1; j < a.length; j++){
            if(a[j] < a[min]){
                min = j;
            }
        }
        if(min != i){
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
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
