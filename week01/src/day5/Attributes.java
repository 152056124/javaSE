package day5;

/**
 *
 * 属性
 */
public class Attributes {
    int a;
    static int b;
    {
        int c;
    }
   static void  demo(){
        int d;
       //System.out.println(d);  运行时错误。
    }

    public static void main(String[] args) {
        demo();
        Attributes attributes = new Attributes();
        System.out.println(attributes.a);
    }

}
