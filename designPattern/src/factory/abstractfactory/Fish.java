package factory.abstractfactory;

public class Fish implements Kind {
    @Override
    public void play() {
        System.out.println("我是鱼类");
    }
}
