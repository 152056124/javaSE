package day4;

/**
 *
 * 递归
 *      求x的阶乘
 */
public class Recursive {
    static int factorial(int x){
        if(x > 0){
           return x * factorial(x - 1);
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(factorial(10));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
