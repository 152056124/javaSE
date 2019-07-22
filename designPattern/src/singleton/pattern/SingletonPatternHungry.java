package singleton.pattern;

/**
 *
 * 饿汉式单例模式
 */
public class SingletonPatternHungry {
    private static SingletonPatternHungry singletonPatternHungry = new SingletonPatternHungry();
    private SingletonPatternHungry(){}
    public static SingletonPatternHungry getInstance(){
        return singletonPatternHungry;
    }
}
