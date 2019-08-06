package day5.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void demo01(){
        InputStream in = null;
        try {
            in = new FileInputStream("week03\\src\\day5\\io\\test.txt");
            byte[] cache = new byte[8];
            String a = "";
            while (in.read(cache) != -1){
                a = a + new String(cache);
            }
            System.out.println(a);
            System.out.println(new String(cache));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void demo02(){
        InputStream in  = null;
        try {
            in = new FileInputStream("week03\\src\\day5\\io\\test.txt");
            byte[] cache = new byte[8];
           int count = -1;
            while ((count = in.read(cache)) != -1){
                String str = new String(cache,0,count);
                System.out.print(str);
                //count = in.read(cache);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void demo03(){
        InputStream in  = null;
        try {
            in = new FileInputStream("week03\\src\\day5\\io\\test.txt");
            byte[] cache = new byte[8];
            int count = in.read(cache);
            while (count  != -1){
                String str = new String(cache,0,count);
                System.out.print(str);
                count = in.read(cache);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void demo04(){
        InputStream in = null;
        try {
            in = new FileInputStream("week03\\src\\day5\\io\\test.txt");
            byte[] cache = new byte[8];
            while (in.read(cache,0,7) != -1){
                for (byte b : cache) {
                    System.out.print((char) b);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        demo01();
        System.out.println("*************");
        demo02();
        System.out.println();
        demo03();
        System.out.println();
        demo04();
    }
}
