package util;

import java.util.*;

public class CollectionsTest {
    static void arrayListDemo(){
        ArrayList<Integer> arrayList = new ArrayList();
        boolean b = arrayList.addAll(ArrayListTest.temp());
        System.out.println(b);
        System.out.println(Arrays.toString(arrayList.toArray()));
        System.out.println(Collections.binarySearch(arrayList, 15));
        Class<ArrayListTest> eClass =  ArrayListTest.class;
        // List list = Collections.checkedList(arrayList, eClass);
        Iterator i = arrayList.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+"\t");
        }
        arrayList.forEach(new Consumer1());
    }
    static void mapDemo(){
        HashMap<Integer,String> h = new HashMap<>();
    }
    public static void main(String[] args) {
        //arrayListDemo();
        mapDemo();
    }
}
