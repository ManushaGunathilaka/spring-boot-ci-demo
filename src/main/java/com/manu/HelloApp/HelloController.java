package com.manu.HelloApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, from CI/CD Pipeline with Jenkins...! This one is From Loadbancer of AWS EKS";
    }
}
