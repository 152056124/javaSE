package day1;

/**
 *
 * 模板语法
 */
public class TemplateSyntax {
    public  static  void  test01(){
        /*
            .fori  生成for循环
         */
        //5.fori
        for (int i = 0; i < 5; i++) {
            
        }
        //3*5.fori
        for (int i = 0; i < 3*5; i++) {
            
        }
       // HelloWorld hw = new HelloWorld();   无法实例化，因为其构造方法被private修饰。
        Object o = new Object();
        String name = o.getClass().getName();

    }


    public static void main(String[] args) {
        Object o = new Object();
        String name = o.getClass().getName();
        System.out.println(name);

        String s = o.toString();
        System.out.println(s);
    }


}
