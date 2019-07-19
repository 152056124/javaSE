package day2.function;

import java.util.Scanner;

/**
 *
 * 鸡兔同笼
 */
public class ChickenAndRabbitCage {
    public  static void in(){
        System.out.println("请输入头的个数：");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        System.out.println("请输入足的个数：");
        int foot = scanner.nextInt();
        System.out.print("头的个数："+head);
        System.out.println("\t足的个数："+foot);

        //x鸡  y兔
        boolean a = true;
        for (int x = 0;x <= head;x++){
            int y = head - x;
            if(x * 2 + y * 4 == foot){
                System.out.println("鸡的个数："+x+"\t兔的个数："+y);
                a = false;
            }
        }
        if (a == true){
            System.out.println("数据输入错误！");
        }

    }

    public static void main(String[] args) {
        in();
    }
}
