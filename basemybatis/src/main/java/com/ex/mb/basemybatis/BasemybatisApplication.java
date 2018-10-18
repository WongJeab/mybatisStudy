package com.ex.mb.basemybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.ex.mb.basemybatis"})
@MapperScan("mapping")
@SpringBootApplication
public class BasemybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasemybatisApplication.class, args);
        System.out.println("======================start success=======================");
    }
}
