package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootConfiguration  等价于@Configuration
 * @EnableAutoConfiguration  框架底层提供了大量配置类，框架根据项目运行环境来决定哪些配置生效
 * @ComponentScan  默认扫描主程序所在的包以及子包
 */
@SpringBootApplication //声明当前应用为SpringBoot应用
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
