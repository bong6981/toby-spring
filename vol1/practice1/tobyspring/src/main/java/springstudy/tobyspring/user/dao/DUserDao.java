package springstudy.tobyspring.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //D사 DB Connection 코드 생성
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/tobyspringvol1", "scott", "tiger");
    }
}
