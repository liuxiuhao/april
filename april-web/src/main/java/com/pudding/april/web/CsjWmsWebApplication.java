package com.pudding.april.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.pudding.april"})
@MapperScan(basePackages = {"com.pudding.april.dao.mapper","com.pudding.april.shiro.mapper"})
public class CsjWmsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsjWmsWebApplication.class, args);
    }

}
