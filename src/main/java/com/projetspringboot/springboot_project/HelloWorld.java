package com.projetspringboot.springboot_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String hello() {
        return "<h1>Hello World</h1>";
    }
    
}
