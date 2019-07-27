package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    private static java.lang.Object Object;
    static ArrayList<Integer> a = new ArrayList<>();
    public static ArrayList temp(){
        a.add(15);
        a.add(25);
        a.add(10);
        return a;
    }
    public static void main(String[] args) {

        a.add(15);
        a.add(25);
        a.add(10);
        Iterator i = a.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+"\t");
        }
        Collections.sort(a);
        System.out.println();
        Iterator j = a.iterator();
        while (j.hasNext()){
            System.out.print(j.next()+"\t");
        }
        int i1 = a.indexOf(25);
        System.out.println(i1);
        a.set(0,77);
        java.lang.Object[] toArray = a.toArray();
        System.out.println(Arrays.toString(toArray));
        a.remove(1);
        System.out.println(Arrays.toString(a.toArray()));

    }
}
