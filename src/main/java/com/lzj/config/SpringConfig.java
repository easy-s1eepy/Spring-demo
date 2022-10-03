package com.lzj.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.lzj")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
