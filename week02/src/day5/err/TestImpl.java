package day5.err;

public class TestImpl {
    public static void main(String[] args) {
        try {
            Test.demo();
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}
