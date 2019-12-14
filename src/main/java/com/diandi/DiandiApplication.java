package com.diandi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.daindi.user.dao")
public class DiandiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiandiApplication.class, args);
    }

}
