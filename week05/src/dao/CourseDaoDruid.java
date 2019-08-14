package dao;

import pojo.Course;

import java.util.List;

public interface CourseDaoDruid {
    //增
    int insertCourse(Course course);
    //删
    int deleteCourseByCno(String cno);
    //改
    int updateCourse(Course course);
    //查
    List<Course> selectCourseByCno(String cno);
}
