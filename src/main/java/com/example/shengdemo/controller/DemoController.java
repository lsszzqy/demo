package com.example.shengdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class DemoController {

    @RequestMapping("/")
    public String index(){
        return "hello world";
    }
}
