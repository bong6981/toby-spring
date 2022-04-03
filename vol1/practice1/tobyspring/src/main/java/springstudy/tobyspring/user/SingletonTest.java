package springstudy.tobyspring.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import springstudy.tobyspring.user.dao.DaoFactory;
import springstudy.tobyspring.user.dao.UserDao;

@Deprecated
public class SingletonTest {
    public static void main(String[] args) {
//        DaoFactory daoFactory = new DaoFactory();
//        UserDao userDao1 = daoFactory.userDao();
//        UserDao userDao2 = daoFactory.userDao();
//
//        System.out.println("userDao1 = " + userDao1);
//        System.out.println("userDao2 = " + userDao2);
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
//        UserDao userDao3 = context.getBean("userDao", UserDao.class);
//        UserDao userDao4 = context.getBean("userDao", UserDao.class);
//
//        System.out.println("userDao3 = " + userDao3);
//        System.out.println("userDao4 = " + userDao4);
//        System.out.println("(userDao4==userDao3) = " + (userDao4==userDao3));
    }
}
