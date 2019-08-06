package week04.day01;

public class TestImpl {
    public static void main(String[] args) {
        try {
            Test.demo01(1000);
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}
