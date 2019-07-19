package day2.function;

/**
 *
 *
 */
public class AboutAddI {
    /**
     * i++ 和 ++i的区别
     */
    public static void addI(){
        int i = 10;
        //       10   12    12    14   14    62
        int j = i++ + ++i + i++ + ++i + i;
        System.out.println(j);
    }
    /**
        位运算符
     */
    public static void leftMove(){
        int i = -16;
        int j = i << 3;
        int k = i >>> 3;
        int y = i >> 3 ;
        System.out.println(j);
        System.out.println(k);
        System.out.println(y);
    }
    public static void main(String[] args) {
       //addI();
        leftMove();
    }
}
