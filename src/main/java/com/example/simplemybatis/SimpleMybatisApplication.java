package com.example.simplemybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.simplemybatis.modules.dao")
public class SimpleMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMybatisApplication.class, args);
    }

}
