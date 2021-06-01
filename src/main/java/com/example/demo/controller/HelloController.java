package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //构造器
    public HelloController(){
        System.out.println("对象实例化");
    }

    @RequestMapping(value = "hello")
    @ResponseBody
    public String getHello(String name){

        return name+ "hello springboot";
    }

}

