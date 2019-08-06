package day5.io;

import java.io.*;
import java.util.Scanner;

public class Copy {
    private static void cinScr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要复制的文件：");
        String s1 = scanner.nextLine();
        System.out.println("你要将文件复制到哪里：");
        String s2 = scanner.nextLine();

        //判断输入的文件是否为空，如果为空，创建一个新的文件。
        File file = new File(s2);
        if (file.exists() == false ){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        InputStream in = null;
        OutputStream out = null;
        try {
             in = new FileInputStream(s1);
             out = new FileOutputStream(file,true);
             byte[] cache = new byte[1024];
             int count = 0;
             while ((count = in.read(cache)) != -1){
                 out.write(cache,0,count);
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        cinScr();
    }
}
