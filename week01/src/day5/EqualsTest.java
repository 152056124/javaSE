package day5;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 *
 * 学习equals类
 */
public class EqualsTest {
    static void demo(){
        EqualsTest equalsTest = new EqualsTest();
        Equals e = new Equals();
        boolean equals = e.equals(equalsTest); //该equals方法为Object类所附带。
        System.out.println(equals);
    }
    public static void main(String[] args) {
        demo();
    }
}
