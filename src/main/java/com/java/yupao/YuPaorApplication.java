package com.java.yupao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.java.yupao.mapper")
public class YuPaorApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuPaorApplication.class, args);
    }

}
