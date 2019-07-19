package day3;

import java.util.Random;

/**
 *
 * 数组
 */
public class Demo01 {
    /**
     *
     * @param index 数组下标
     * @param x     随机数范围（0--x）
     */
    public static void demo1(int index,int x){
        //定义
        int[] array = new int[index];
        //赋随机值
        Random random = new Random();
        for (int i = 0;i < array.length;i++){
            array[i] = random.nextInt(x);
        }
        //遍历打印
        for (int i : array) {
            System.out.print(i+" ");
        }
        //求最大、最小值
        int a = array[0];
        int b = array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i] > a){
                a = array[i];
            }
            if(array[i] < b){
                b = array[i];
            }
        }
        System.out.println("");
        System.out.println("最大值："+a);
        System.out.println("最小值："+b);
        //求总和、平均值
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum = array[i]+sum;
        }
        System.out.println("总和："+sum);
        System.out.println("平均值："+sum/array.length);

    }
    public static void main(String[] args) {
        demo1(10,1000);
    }
}
