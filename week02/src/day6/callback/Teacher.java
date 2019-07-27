package day6.callback;

public class Teacher implements Callback {
    private Students students;

    public Teacher(Students students) {
        this.students = students;
    }
    public void askQuestion(Students students){
        students.resolveQuestion(this);
    }

    @Override
    public void tellAnswer(String answer) {
        System.out.println("你的回答正确！");
    }
}
