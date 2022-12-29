package com.example.subject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/subject")
public class HomeController {
    @GetMapping("/")
    public String ShowContext() {
        return "home";
    }
}