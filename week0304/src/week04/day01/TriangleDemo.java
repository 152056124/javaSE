package week04.day01;

public class TriangleDemo {
    static void isTriangle(int a,int b,int c) throws IllegalArgumentException{
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("三角形边长分别为："+ a +" "+ b+" " + c);
        }
        throw new IllegalArgumentException("不能构成生三角形");
    }

    public static void main(String[] args) {
        TriangleDemo.isTriangle(2,5,15);
    }
}
