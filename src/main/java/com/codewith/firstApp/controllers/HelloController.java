package com.codewith.firstApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/Waffle")
    public String hello(){
        return "Welcome to Waffle spot. Have a nice day";
    }
}
