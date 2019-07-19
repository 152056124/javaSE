package day4;

/**
 *
 * 参数传递
 *      值传递
 */
public class ParameterPassing {

    public static void main(String[] args) {
       int a = 10;
        System.out.println(demo(a)); //15
        System.out.println(a);       //10
    }
    static int  demo(int a){
        a = 15;
        return a;
    }
}
