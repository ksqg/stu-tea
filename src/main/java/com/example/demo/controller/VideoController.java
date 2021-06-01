package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class VideoController {
    @RequestMapping(value="video")
    public String getVideoInfo(){
        return "惊悚电影";
    }
}
