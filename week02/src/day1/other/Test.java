package day1.other;

public class Test {
    public static void main(String[] args) {
        SonCode s = new SonCode();
        /*目前执行顺序：
            父类静态代码块
                子类静态代码块
        父类非静态代码块
        父类构造方法.
                子类非静态代码块
        子类构造方法.
                */
//        cb.demo01();
//        CodeBlockExecutionOrder.demo02();
//        Son.demo02();
//        s.demo01();
        /*
            执行顺序：方法的调用顺序。
            父类方法
            父类静态方法
            子类静态方法.
            子类方法。
         */
    }
}
