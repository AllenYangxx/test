package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestApiApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TestApiApplication.class, args);
    }
}
