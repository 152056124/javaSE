package test;

import dao.impl.CourseDaoImpl;
import pojo.Course;

import java.util.ArrayList;

public class CourseDaoTest {
    public static void main(String[] args) {
        CourseDaoImpl courseDao = new CourseDaoImpl();
//        int i = courseDao.deleteCourseByCno("C009");
//        System.out.println(i);

        ArrayList<Course> courses = courseDao.selectCourseByCno("C001");
        for (Course cours : courses) {
            System.out.println(cours);
        }

//        int i = courseDao.insertCourse("C009", "你好吗", 1, 1);
//        System.out.println(i);

//        int i = courseDao.updateCourseByCno("C009", "软件工程");
//        System.out.println(i);
    }
}
