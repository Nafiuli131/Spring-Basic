package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    @GetMapping("/helloWorld")
    public String helloWorld(){
        System.out.println("rest controller");
        return "Hello Nafiul Islam-----!";
    }
}
