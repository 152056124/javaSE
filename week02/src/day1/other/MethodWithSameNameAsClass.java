package day1.other;

/**
 *
 * 与类同名的方法:
 *  可以为普通方法，可以为构造方法
 *
 */
public class MethodWithSameNameAsClass {
    public void MethodWithSameNameAsClass(){
        System.out.println("普通方法");
    }
    private  MethodWithSameNameAsClass(){
        System.out.println("构造方法");
    }
}
