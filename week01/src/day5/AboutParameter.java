package day5;

public class AboutParameter {
    int a = 15;
    public int demo(){
        return a;
    }

    public static void main(String[] args) {
        int a = 20;
        AboutParameter b = new AboutParameter();
        b.demo();
        System.out.println(b.demo());
        System.out.println(a);
    }
}
