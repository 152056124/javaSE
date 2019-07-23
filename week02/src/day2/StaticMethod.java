package day2;



public class StaticMethod {
    static void demo(){
        System.out.println("父类静态方法。");
    }
}
class C extends StaticMethod{

//    static void demo(){
//        System.out.println("子类静态方法。");
//    }

    public static void main(String[] args) {
        StaticMethod ss = new StaticMethod();
        ss.demo();
        C.demo();
        StaticMethod sss = new C();
        sss.demo();
    }
}
