package day4.arraylistdemo;

public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("15");
        myArrayList.add("20");
        myArrayList.add("33");
        Object a1 = myArrayList.get(1);
        System.out.println(a1);
        System.out.println(myArrayList);
        myArrayList.delete(1);
        System.out.println(myArrayList);
        myArrayList.set(1,"66");
        System.out.println(myArrayList);
        System.out.println(myArrayList.insert(1, "55").toString());
        System.out.println(myArrayList);
        System.out.println(myArrayList.insert(19, "5").toString());

    }
}
