package com.wbellang.webappone.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from WebApp One, a Docker Containerized Spring Boot application!";
    }
}
