package test;

import dao.impl.CourseDaoDruidImpl;
import pojo.Course;

public class CourseDaoDruidTest {
    public static void main(String[] args) {
        Course course = new Course();
        course.setCno("C010");
        course.setCname("数学课");
        course.setCredit(5);
        course.setSemester(6);
        CourseDaoDruidImpl courseDaoDruid = new CourseDaoDruidImpl();
        int i = courseDaoDruid.insertCourse(course);
        System.out.println(i);
    }
}
