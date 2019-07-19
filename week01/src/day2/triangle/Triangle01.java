package day2.triangle;

/**
 *
 * for循环打印三角形
 */
public class Triangle01 {
    //正左直角
    public static void test01(){
        for (int i = 0; i < 5;i++){
            for (int j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //正左倒直角
    public static void test02(){
        for (int i = 5;i > 0;i--){
            for (int j =1 ;j < i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //正右直角
    public static void test03(){
        for (int i = 0; i < 5;i++){
            for (int k = 4;k > i;k--){
                System.out.print(" ");
            }
            for (int j = 0;j < i;j++){

                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //正右直倒
    public static void test04(){
        for (int i = 0; i < 5;i++){
            for (int j = 0;j < i;j++){
                System.out.print(" ");
            }
            for (int k = 4;k > i;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        //test01();
        //test02();
        //test03();
        //test04();
    }
}
