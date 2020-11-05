package com.example.springscuritylogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/emp")
public class Employee {


    @GetMapping("/get")
    public String getEmployee(){
        return "Simple Spring security App.";
    }
}
