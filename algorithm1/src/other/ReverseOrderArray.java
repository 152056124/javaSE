package other;

import java.util.Arrays;
import java.util.Random;

/**
 * 逆序数组
 */
public class ReverseOrderArray {
    static int[] demo01(int[] array){
        int[] a = Arrays.copyOf(array, array.length);

        if (a.length == 0){
            return null;
        }
        for (int i = 0,j = a.length - 1; i < a.length / 2; i++,j--) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;

        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = new int[9];
        Random random  = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(demo01(a)));

    }
}
