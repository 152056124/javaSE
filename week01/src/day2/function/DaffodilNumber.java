package day2.function;

/**
 * 水仙花数
 * 三位数，每位的三次方相加等于自身
 */
public class DaffodilNumber {
    public static void test01(){

        for (int xyz = 100;xyz < 1000;xyz++){
            int z = xyz % 10;                //个位数
            int y = ( ( xyz - z ) % 100 )/10;//十位数
            int x = (xyz - z - y * 10)/100;  //百位数
            if (z * z * z + y * y * y + x * x * x == xyz){
                System.out.println(xyz);
            }
        }
    }
    public static void main(String[] args) {
        test01();
    }
}
