package day5.enumdemo2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        PeopleEnum teacher = PeopleEnum.valueOf("TEACHER");
        PeopleEnum[] values = PeopleEnum.values();
        System.out.println(Arrays.toString(values));
        System.out.println(teacher);
    }
}
