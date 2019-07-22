package day3;

import java.util.Arrays;

/**
 *
 * 二维数组
 */
public class TwoDimensionalArray {
    public static void demo(){
        int[][] a = new int[3][4];
        a[0] = new int[2];
        a[1] = new int[5];
        a[2] = new int[]{2,3};
        System.out.println(a[0][1]);
    }
    static void demo01(){
        int[][] a = new int[5][];
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        demo01();
    }
}
