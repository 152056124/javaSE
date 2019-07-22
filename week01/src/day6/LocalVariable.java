package day6;

/**
 *
 * 局部变量
 */
public class LocalVariable {
    public int demo01(){
        int a = 10;
        return a;
    }

    public static void main(String[] args) {
        LocalVariable localVariable = new LocalVariable();
        int a = localVariable.demo01();
        System.out.println(a);

    }
}
