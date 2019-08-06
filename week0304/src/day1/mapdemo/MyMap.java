package day1.mapdemo;

import java.util.*;

public class MyMap {
    static void hashMapDemo(){
        HashMap<Integer,String> a = new HashMap<>();
        a.put(1,"1号");
        a.put(2,"2号");
        a.put(3,"3号");
        a.put(4,"4号");
        Set<Map.Entry<Integer, String>> entries = a.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print(entry.getKey() + "\t");
            System.out.println(entry.getValue());
        }
    }
    static void treeMapDemo(){
        //TreeMap<Integer,String> t = new TreeMap<>((Integer o1, Integer o2) -> - (o1 - o2));
        //TreeMap<Integer,String> t = new TreeMap<>((o1, o2) -> - (o1 - o2));
        TreeMap<Integer,String> t = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            }
        });
        t.put(1,"1号");
        t.put(2,"2号");
        t.put(3,"3号");
        t.put(4,"4号");

        Set<Integer> keySet = t.keySet();
        for (Integer integer : keySet) {
            System.out.print(integer  + "\t");
            System.out.println(t.get(integer));
        }
    }
    public static void main(String[] args) {
        //hashMapDemo();
        treeMapDemo();
    }
}
