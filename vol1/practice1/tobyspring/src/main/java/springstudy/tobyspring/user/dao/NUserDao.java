package springstudy.tobyspring.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import springstudy.tobyspring.user.domain.User;

public class NUserDao extends UserDao{
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //N사 DB Connection 코드 생성
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/tobyspringvol1", "scott", "tiger");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new NUserDao();

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println("user2 = " + user2.getName());
        System.out.println("user2.getPassword() = " + user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}
