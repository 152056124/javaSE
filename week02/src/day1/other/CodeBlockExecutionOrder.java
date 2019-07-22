package day1.other;

/**
 *
 *      代码块执行顺序：
         *  父类静态代码块
         *  子类静态代码块
         *  父类非静态代码块
         *  父类构造方法.
         *  子类非静态代码块
         *  子类构造方法.
 */
public class CodeBlockExecutionOrder {
    public CodeBlockExecutionOrder() {
        System.out.println("父类构造方法.");
    }
    static {
        System.out.println("父类静态代码块");
    }

    public void demo01(){
        System.out.println("父类方法");
    }
    static void demo02(){
        System.out.println("父类静态方法");
    }
    {
        System.out.println("父类非静态代码块");
    }
}
