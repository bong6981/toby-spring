package springstudy.tobyspring.user.dao;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springstudy.tobyspring.user.domain.User;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class); 를 수정
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        userDao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = userDao.get(user.getId());
        System.out.println("user2 = " + user2.getName());
        System.out.println("user2.getPassword() = " + user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}
