package nwpu.web.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 读取jdbc.properties文件的内容,加载DruidDataSource并作为bean
 */
//@Configuration
public class JdbcConfig {

    //为第三方bean注入简单类型
    //注入引用类型在方法上添加参数
    //@Value("com.mysql.jdbc.Driver")
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //管理第三方bean，@Bean注解的作用是将方法的返回值制作为Spring管理的一个bean对象
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
