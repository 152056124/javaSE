package week04.day01;

public class Demo03 {
    private  double r;

    public Demo03(){

    }
    public Demo03(double r){
        this.r = r;
    }
    public  double getArea(double r){
       return Math.PI * r * r;
    }
    void show(double r){
       double a =  getArea(r);
        System.out.println(a +" "+ r );
    }

    public static void main(String[] args) {
        Demo03 d = new Demo03();
        double area = d.getArea(2);
        System.out.println(area);
        d.show(2);
    }
}
