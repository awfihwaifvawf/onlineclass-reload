package com.online.content;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class ServiceContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceContentApplication.class, args);
    }
}
