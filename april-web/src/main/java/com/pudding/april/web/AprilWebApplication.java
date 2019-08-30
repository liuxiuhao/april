package com.pudding.april.web;

import com.pudding.april.shiro.ShiroWebApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.pudding.april"})
@MapperScan(basePackages = {"com.pudding.april.dao.mapper","com.pudding.april.shiro.mapper"})
public class AprilWebApplication {

    public static void main(String[] args) {
        Class<?>[] obj = new Class<?>[2];
        obj[0] = ShiroWebApplication.class;
        obj[1] = AprilWebApplication.class;
        SpringApplication.run( obj, args);
    }

}
