package dao;


import pojo.Course;

import java.util.ArrayList;

public interface CourseDao {

    int deleteCourseByCno(String cno);

    ArrayList<Course> selectCourseByCno(String cno);

    int insertCourse(String cno,String cname,int credit,int semester);

    int updateCourseByCno(String cno,String name);
}
