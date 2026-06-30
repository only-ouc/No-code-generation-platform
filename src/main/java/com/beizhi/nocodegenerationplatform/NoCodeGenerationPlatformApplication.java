package com.beizhi.nocodegenerationplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.beizhi.nocodegenerationplatform.mapper")
public class NoCodeGenerationPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoCodeGenerationPlatformApplication.class, args);
    }

}
