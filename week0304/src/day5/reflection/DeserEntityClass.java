package day5.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserEntityClass {
    public static void main(String[] args) {
        EntityClass entityClass = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("D:\\FFOutput\\EntityClass2.txt");
            ois = new ObjectInputStream(fis);
            entityClass = (EntityClass) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int count = entityClass.getCount();
        String name = entityClass.getName();
        System.out.println(count + " " + name);
    }
}
