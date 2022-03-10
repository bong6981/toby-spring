package springstudy.tobyspring.user.dao;

public class DaoFactory {
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    private ConnectionMaker connectionMaker() {
        return new NConnectionMaker();
    }
}
