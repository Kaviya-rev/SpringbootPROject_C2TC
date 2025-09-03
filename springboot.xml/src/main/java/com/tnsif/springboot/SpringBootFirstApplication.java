package com.tnsif.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication {   // ✅ Class name and file name must match

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstApplication.class, args);
    }
}
