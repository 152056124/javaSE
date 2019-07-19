package day4;

import java.util.Scanner;

/**
 * 银行管理系统
 */
public class Bank {
    public static void main(String[] args) {
        cin();
    }
    private static int money = 0;
    static  int ss ;
    static Scanner scanner = new Scanner(System.in);

    static void cin(){
        System.out.println("******服务选项******");
        System.out.println("1.查询余额");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.退出");
        System.out.println("********************");
        System.out.println("请输入对应代码选择服务：");

        while (true){
            int nextInt = scanner.nextInt();
            ss = nextInt;
            switch (ss){
                case 1:
                    checkBalances();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdrawal();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("当前服务结束，已退出。");
                    System.out.println("********************");
                    return;
                default:
                    err();

            }
        }

    }
    //查询余额
    static void checkBalances(){
        System.out.println("当前正在办理的业务为：查询余额");
        System.out.println("当前余额为："+money);
    }
    //存款
    static void deposit(){
        System.out.println("当前正在办理的业务为：存款");
        System.out.println("请输入存入金额：");
        int inMoney = scanner.nextInt();
        money += inMoney;
        System.out.println("存款成功！\t当前余额为："+money);
    }
    //取款
    static void withdrawal(){
        System.out.println("当前正在办理的业务为：取款");
        System.out.println("请输入取出金额：");
        int outMoney = scanner.nextInt();
        if(outMoney > money){
            System.out.println("对不起，余额不足！");
        }else {
            money -= outMoney;
            System.out.println("取款成功！\t当前余额为："+money);
        }
    }
    //转账
    static void transfer(){
        System.out.println("当前正在办理的业务为：转账");
        System.out.println("请输入转出人银行卡号：");
        scanner.nextLine();
        String card = scanner.nextLine();
        System.out.println("请输入转出金额：");
        int toMoney = scanner.nextInt();
        if(toMoney > money){
            System.out.println("对不起，余额不足！");
        }else {
            money -= toMoney;
            System.out.println("转账成功！\t您给卡号为"+card+"的银行卡转账"+toMoney+"元。\n当前余额为："+money);
        }
    }
    //输入错误
    static void err(){
        System.out.println("代码输入错误！请重新输入：");
    }
}
