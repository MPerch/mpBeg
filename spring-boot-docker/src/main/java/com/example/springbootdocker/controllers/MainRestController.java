package com.example.springbootdocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainRestController {

    @GetMapping(value = "line")
    public String showMeThisLine(){
        return "Some name";
    }
}
