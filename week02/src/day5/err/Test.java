package day5.err;

public class Test {
    public static void demo() throws TestException {
        if(true){
            throw new TestException("hello");
        }

    }
}
