package day2.transformation;

/**
 *
 * 引用类型的转型
 */
public class ReferenceType {
    public static void main(String[] args) {
        Father father = new Child();   //向上转型，隐藏子类中额外拓展的方法
        Child child = (Child) father; //向下转型，释放子类中拓展的方法



        Child c = (Child) new Father();
        c.childDemo();
        //father.childDemo(); //编译不通过
        child.childDemo();   //编译通过
        ((Child) father).childDemo();   //编译通过

        //        Father f = new Father();
        //        Child c1 = (Child) f;

        father.fatherDemo();    //child,father返回子类中重写的方法；如果子类中没有重写，则返回父类中的原方法。
    }
}
