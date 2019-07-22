package day1.abstractdemo;

public class TestImpl {
    public static void main(String[] args) {
        AbstractDemoImpl abstractDemoimpl = new AbstractDemoImpl(1,5);
        System.out.println(abstractDemoimpl.syso(10));
    }
}
