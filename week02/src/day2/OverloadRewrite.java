package day2;

/**
 *
 * 重载重写
 */
public class OverloadRewrite {
    public  void demo(){

    }
    public  void demo(int a,double b){

    }
    public  int demo(double b,int a){
        return a;
    }

}
class A extends OverloadRewrite{
    @Override
    public void demo() {
        super.demo();
    }

    @Override
    public int demo(double b, int a) {
        return super.demo(b, a);
    }
}
