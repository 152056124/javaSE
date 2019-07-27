package day5.err;

public class TestException extends Exception {
    public TestException(String message) {
        super(message);
    }

    public TestException(Throwable cause) {
        super(cause);
    }

}
