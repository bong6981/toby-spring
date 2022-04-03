package springstudy.tobyspring.user.dao;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }

    @Bean
    public DataSource dataSource() {
//        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//        dataSource.setDriver(data);
//        dataSource.setUrl("jdbc:mysql://localhost/tobyspringvol1");
//        dataSource.setUsername("scott");
//        dataSource.setUsername("tiger");
//        return dataSource;
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost/tobyspringvol1")
                .username("scott")
                .password("tiger")
                .build();
    }
}
