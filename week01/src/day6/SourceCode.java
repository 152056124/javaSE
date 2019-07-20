package day6;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * Java源码阅读
 */
public class SourceCode extends Random{
    public static void main(String[] args) {
        //Object类
        Object object = new Object();
        //String类
        String string = new String();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        //Arrays类
            //Arrays类将构造器私有化了，所以不能通过new关键字实例化。
            //Arrays arrays = new  Arrays();
        int[] array = new int[5];
        Arrays.sort(array);
        //Random类
        /*
            nextInt()本质是返回next(32);
            nextInt(int bound)
         */
        Random random = new Random();
        int v1 = random.nextInt(10);
        int v2 = (int)(Math.random() * 10);

        //Math.random()本质上就是random.nextDouble();
        double d1 = random.nextDouble();
        double d2 = Math.random();

        System.out.println(d1);
        System.out.println(d2);
        //System.out.println(v1);
        //System.out.println(v2);
        IntStream intStream = random.ints();

    }
}
