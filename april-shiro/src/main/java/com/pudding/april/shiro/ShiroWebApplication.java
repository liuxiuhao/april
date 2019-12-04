package com.pudding.april.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages={"com.pudding.april"})
@MapperScan(basePackages = {"com.pudding.april.shiro.mapper"})
public class ShiroWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroWebApplication.class, args);
    }

}
