package util;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {
    // Arrays arrays = new Arrays();//Arrays类构造器是私有的，不能通过new来实例化。
    static int[] array1 = new int[20];
    static  Random random = new Random();

    /**
     * 赋值随机数
     */
    static void demo01(){
        for (int i = 0; i < array1.length; i++) {
            int nextInt = random.nextInt(100);
            array1[i] = nextInt;
        }
        int a = 10;
    }

    /**
     * foreach不能为数组赋值
     */
    static void demo02(){
        /*
        for (int i : array1) {
            i = 10;
        }
        //相当于下面这个代码，array1[i]为临时变量，值未改变。
        //所以foreach循环只可以遍历输出，不可以插入。
        for (int i = 0; i < array1.length; i++) {
             int a = array1[i];
             a = 10;
            //System.out.print(a);
        }
        */
    }

    /**
     * 数组的扩容/排序/查找
     */
    static void demo03(){
        //数组的复制，可以扩容或剪裁，数组元素默认为0;
        int[] array2 = Arrays.copyOf(array1, array1.length + array1.length / 2);

        //当数组长度小于286.为一种排序。
        Arrays.sort(array1);

        // return -(low + 1);  // key not found.
        int binarySearch = Arrays.binarySearch(array1, 15);
        System.out.println(binarySearch);
        String strArray1 = Arrays.toString(array1);
        System.out.println(strArray1);
        System.out.println(Arrays.toString(array2));
    }

    /**
     * Arrays.equals(int[] a,int[] b);方法
     */
    static void demo04(){
        int[] b1 = new int[5];
        int[] b2 = new int[5];
        int[] c1 = null;
        int[] c2 = null;
        //比较的是数组的内容是否相同。
        boolean equals = Arrays.equals(b1, b2);
        boolean equals2 = Arrays.equals(c1, c2);
        System.out.println(c1 == null); // true
        System.out.println(Arrays.toString(c1));//null
        System.out.println(equals2); //true
        System.out.println(Arrays.equals(c1,b1));
    }
    public static void main(String[] args) {
        demo01();
        demo03();
        demo04();
    }
}
