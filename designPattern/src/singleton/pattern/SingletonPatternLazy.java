package singleton.pattern;

/**
 *
 * 懒汉式单例模式
 *  安全  有synchronized关键字修饰
 *  不安全
 */
public class SingletonPatternLazy {
    private static SingletonPatternLazy singletonPatternLazy;
    private SingletonPatternLazy(){}
    public static synchronized SingletonPatternLazy getInstance(){
        if(singletonPatternLazy == null){
            singletonPatternLazy = new SingletonPatternLazy();
        }
        return singletonPatternLazy;
    }

}
