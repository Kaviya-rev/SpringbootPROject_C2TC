package com.tnsif.springboot;

import org.springframework.web.bind.annotation.GetMapping;   // 👈 add this
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to your first Spring Boot App Development";
    }
}
