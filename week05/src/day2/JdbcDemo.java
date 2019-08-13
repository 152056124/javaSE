package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void demo01(){
        Connection con = null;
        Statement statement = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8","root","12358");
            statement = con.createStatement();
            int count = statement.executeUpdate("insert into course values ('C010','你好',5,99)");
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        demo01();
    }
}
