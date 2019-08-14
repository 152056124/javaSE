package dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import dao.CourseDaoDruid;
import pojo.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CourseDaoDruidImpl implements CourseDaoDruid {

        private static  final  DruidDataSource druidDataSource = new DruidDataSource();
        static {
            druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
            druidDataSource.setUrl("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8");
            druidDataSource.setUsername("root");
            druidDataSource.setPassword("12358");
        }

    @Override
    public int insertCourse(Course course) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;
        try {
            connection = druidDataSource.getConnection();
            String sql = "insert into course values (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,course.getCno());
            preparedStatement.setString(2,course.getCname());
            preparedStatement.setInt(3,course.getCredit());
            preparedStatement.setInt(4,course.getSemester());
            count = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    @Override
    public int deleteCourseByCno(String cno) {
        return 0;
    }

    @Override
    public int updateCourse(Course course) {
        return 0;
    }

    @Override
    public List<Course> selectCourseByCno(String cno) {
        return null;
    }
}
