package com.yj2.watermelon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yj2.watermelon.mapper")
@SpringBootApplication
public class WatermelonApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatermelonApplication.class, args);
    }

}
