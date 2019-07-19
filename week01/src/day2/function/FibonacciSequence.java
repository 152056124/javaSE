package day2.function;

/**
 * 斐波那契数列
 * 1 1 2 3 5 8 13
 */
public class FibonacciSequence {
    public static void test01(int x){
        System.out.print(1+" "+1+" ");
        for (int i = 1,j = 1;i < x;){
          i = i + j;
            System.out.print(i+" ");
          j = i + j;
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        test01(2000);
    }
}
