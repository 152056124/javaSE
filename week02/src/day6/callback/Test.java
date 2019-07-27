package day6.callback;

public class Test {
    public static void main(String[] args) {
        Students students = new XiaoMing();
        Callback teacher = new Teacher(students);
        teacher.tellAnswer("nihao");
    }
}
