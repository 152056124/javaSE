package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
//    public static int[] demo01(int[] array){
//        int[] arr = Arrays.copyOf(array,array.length);
//        if (arr.length == 0) return arr;
//        for (int i = 0; i < arr.length-1; i++) {
//            boolean flag = true;
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                    flag = false;
//                }
//            }
//            if (flag){
//                break;
//            }
//        }
//        return arr;
//    }
public static int[] demo01(int[] arr){
    int[] a = Arrays.copyOf(arr,arr.length);

    if(a.length == 0){
        return a;
    }
    for(int i = 0; i < a.length; i++){
        boolean b = true;
        for(int j = 0; j < a.length - 1 - i; j++){
            if(a[j] > a[j + 1]){
                int temp = a[j + 1];
                a[j + 1] = a[j];
                a[j] = temp;
                b = false;
            }
        }
        if(b){
            break;
        }
    }
    return a;
}
    public static void main(String[] args) {
        int[] a = {5,1,3,6,99,7,8,2};
        for (int i : a) {
            System.out.print("\t"+i);
        }
        System.out.println(" ");
        int[] ints = demo01(a);
        for (int i : ints) {
            System.out.print("\t"+i);
        }
    }
}
