package day4.enumdemo;

public class TestSeasonEnum {
    public static void main(String[] args) {
        SeasonEnum spring = SeasonEnum.SPRING;
        System.out.println(spring.toString());
        String name = spring.getName();
        System.out.println(name);
    }
}
