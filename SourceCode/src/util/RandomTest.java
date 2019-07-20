package util;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        //Math.random()本质上就是random.nextDouble();
        double d1 = random.nextDouble();
        double d2 = Math.random();
        System.out.println(d1);
        System.out.println(d2);

        // nextInt()本质是返回next(32);
        // nextInt(int bound)
        int v1 = random.nextInt(10);
        int v2 = (int)(Math.random() * 10);
        //System.out.println(v1);
        //System.out.println(v2);

        //无限流
        IntStream intStream = random.ints();
    }
}
