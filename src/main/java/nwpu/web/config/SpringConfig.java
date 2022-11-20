package nwpu.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * spring配置类
 */
//定义为spring配置类
@Configuration
//扫描项目IOC容器装配bean
@ComponentScan("nwpu.web.service")
//注解加载数据库连接properties配置文件，Dao层读取配置文件的内容并连接数据库
@PropertySource("classpath:jdbc.properties")
//加载jdbcConfig配置类
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
