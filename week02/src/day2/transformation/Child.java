package day2.transformation;

public class Child extends Father {
    public  void  childDemo(){
        System.out.println("child");
    }

    @Override
    public void fatherDemo() {
        System.out.println("child,father");
    }
}
