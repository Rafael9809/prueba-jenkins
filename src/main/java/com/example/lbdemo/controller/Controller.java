package com.example.lbdemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {

    @Value("${msg.resp}")
    private String msg;

    @GetMapping("/pruebalb")
    public String getMethodName() {
        return msg;
    }
    

}
