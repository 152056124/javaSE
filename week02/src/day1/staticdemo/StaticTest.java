package day1.staticdemo;

/**
 *
 * static关键字学习:饿汉式单例
 */
public class StaticTest {
    private StaticTest(){

    }
    private static StaticTest st = new StaticTest();
    public static StaticTest NewStaticTest(){
       return st;
    }

}
