package dao.impl;

import dao.CourseDao;
import pojo.Course;

import java.sql.*;
import java.util.ArrayList;

public class CourseDaoImpl implements CourseDao {

    @Override
    public int deleteCourseByCno(String cno) {
        Connection c = null;
        Statement s = null;
        int row = 0;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8","root","12358");
            s = c.createStatement();
            row = s.executeUpdate("delete from course where Cno = " +" '"+ cno + " '");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(c != null){
                    c.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(s != null){
                    s.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }

    @Override
    public ArrayList<Course> selectCourseByCno(String cno) {
        Course course = new Course();
        Connection c = null;
        Statement s = null;
        ResultSet resultSet  = null;
        ArrayList<Course> courseList = new ArrayList<>();
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8","root","12358");
            s = c.createStatement();
            String sql = "select * from course where Cno = " + " '" + cno + " '";
             resultSet = s.executeQuery(sql);
            while (resultSet.next()){
                course.setCno(resultSet.getString("Cno"));
                course.setCname(resultSet.getString("Cname"));
                course.setCredit(resultSet.getInt("Credit"));
                course.setSemester(resultSet.getInt("Semester"));
                courseList.add(course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(c != null)
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(s != null){
                    s.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return courseList;
    }

    @Override
    public int insertCourse(String cno, String cname, int credit, int semester) {
        Connection c = null;
        Statement s = null;
        int count  = 0;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8","root","12358");
            s = c.createStatement();
            String sql = "insert into course values (" + "'" +cno + "','" +cname + "'," + credit + "," + semester + ")" ;
            count = s.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(c != null){
                    c.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(s != null){
                    s.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    @Override
    public int updateCourseByCno(String cno, String name) {
        Connection c = null;
        Statement s = null;
        int count = 0;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8","root","12358");
            s = c.createStatement();
            String sql = "update course set Cname = " + "'" + name + "'" + "where Cno = " + "'" + cno + "'";
            count  = s.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(c != null){
                    c.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(s != null){
                    s.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return count;
    }
}
