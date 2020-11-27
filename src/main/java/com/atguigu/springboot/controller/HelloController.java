package com.atguigu.springboot.controller;


import com.atguigu.springboot.bean.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //相当于 @Controller + @ResponseBody
public class HelloController {

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Value("${server.port}")
    private String port;


    @RequestMapping("/hello")
    public String sayHello(){

        System.out.println(dataSourceProperties);

        System.out.println("port = " + port);

        return "hello spring boot!!!";
    }

}
