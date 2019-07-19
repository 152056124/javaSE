package day2.triangle;

public class AzCycle {
    //a--z--a
    public static void test01(){
        for (int i = 97;i < 123;i++){
            System.out.print((char) i+" ");
        }
        for (int i = 121; i > 96;i--){
            System.out.print((char)i+" ");
        }
    }

    public static void main(String[] args) {
        test01();
    }
}
