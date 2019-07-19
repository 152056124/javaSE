package Find;

import java.util.Arrays;

/**
 * 二分查找
 */
public class BinarySearch {
//    public static String demo01(int[] a,int target){
//        Arrays.sort(a);
//        boolean bo = false;
//        int low = 0;
//        int high = a.length - 1;
//        while (low <= high){
//            int middle = (low + high) / 2;
//            // low + high/2 - low/2
//            if(target == a[middle]){        //此处为a[middle],而不是middle
//                bo = true;
//                return "数值下标： "+ middle + " "+bo;
//            }else  if (target < a[middle]){
//                high = middle - 1;
//            }else {
//                low = middle + 1;
//            }
//        }
//        return "数据不在该集合中";
//    }
public static boolean demo01(int[] arr,int b){
    Arrays.sort(arr);
    int lo = 0;
    int hi = arr.length - 1;
    while(lo <= hi){
        int middle = (lo + hi) / 2;
        if(arr[middle] == b){
            return true;
        }else if(arr[middle] > b){
            hi = middle - 1;
        }else{
            lo = middle + 1;
        }
    }
    return false;
}

    public static void main(String[] args) {
        int[] a = {1,5,3,66,99,55,4,7};
        boolean i = demo01(a, 4);
        boolean j = demo01(a, 10);
        System.out.println(i);
        System.out.println(j);
    }
}
