package day6;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Java源码阅读
 */
public class SourceCode {
    public static void main(String[] args) {
        //Object类
        Object object = new Object();
        //String类
        String string = new String();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        //Arrays类
            //Arrays类将构造器私有化了，所以不能通过new关键字实例化。
            //Arrays arrays = new  Arrays();
        int[] array = new int[5];
        Arrays.sort(array);
        //Random类
        Random random = new Random();
    }
}
