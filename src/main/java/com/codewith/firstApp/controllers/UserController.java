package com.codewith.firstApp.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")   // 👈 CORS HERE
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("Kowshika", "Test User");
    }
}
