package week04.day01;

/**
 * 考试测试
 */
public class Test {
    public static void demo01(int i) throws TestException {
        if (i >= 0 && i <= 100){
            System.out.println(i);
        }
        throw new TestException("分数不在0--100之间");
    }
    public static void main(String[] args) {
    }
}
