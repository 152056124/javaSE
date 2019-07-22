package day1.abstractdemo;

import java.util.Objects;

/**
 *
 * 抽象类测试
 */
public abstract class AbstractDemo {
    private int a;
    private static int b;
    private int c;

    abstract String syso(int a);

    public AbstractDemo(int a, int c) {
        this.a = a;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        AbstractDemo.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDemo that = (AbstractDemo) o;
        return a == that.a &&
                c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, c);
    }
}
