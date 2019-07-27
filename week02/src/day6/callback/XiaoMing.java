package day6.callback;

public class XiaoMing implements Students {
    @Override
    public void resolveQuestion(Callback callback) {
        callback.tellAnswer("答案是123456");
        System.out.println("答案是1456789");
    }
}
