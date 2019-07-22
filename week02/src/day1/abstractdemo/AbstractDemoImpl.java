package day1.abstractdemo;

public class AbstractDemoImpl extends AbstractDemo{
    @Override
    String syso(int a) {
        return a+"";
    }

    public AbstractDemoImpl(int a, int c) {
        super(a, c);
    }
}
