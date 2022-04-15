package com.dreamingj.edu_rating;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.dreamingj.edu_rating.mapper")
public class EduRatingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduRatingApplication.class, args);
    }

}
