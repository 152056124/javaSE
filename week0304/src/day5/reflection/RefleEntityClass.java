package day5.reflection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RefleEntityClass {
    public static void main(String[] args) {
        EntityClass entityClass = new EntityClass();
        entityClass.setCount(1000);
        entityClass.setName("张三");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("D:\\FFOutput\\EntityClass2.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(entityClass);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
