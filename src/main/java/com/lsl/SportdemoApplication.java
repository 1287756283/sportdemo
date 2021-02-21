package com.lsl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lsl.dao")
@SpringBootApplication
public class SportdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportdemoApplication.class, args);
    }

}
