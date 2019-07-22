package day1.other;

class SonCode extends CodeBlockExecutionOrder{
    {
        System.out.println("子类非静态代码块");
    }
    public SonCode() {
        System.out.println("子类构造方法.");
    }
    static {
        System.out.println("子类静态代码块");
    }

    @Override
    public void demo01() {
        System.out.println("子类方法。");
    }
    static void demo02(){
        System.out.println("子类静态方法.");
    }
}

