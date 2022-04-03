package springstudy.tobyspring.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

@Deprecated
public interface ConnectionMaker {
    public Connection getConnection() throws ClassNotFoundException, SQLException;
}
