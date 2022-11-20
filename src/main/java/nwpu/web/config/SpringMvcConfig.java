package nwpu.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"nwpu.web.controller","nwpu.web.config"})
public class SpringMvcConfig {
}