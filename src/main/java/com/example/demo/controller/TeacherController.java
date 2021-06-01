package com.example.demo.controller;

import com.example.demo.dao.TeacherDao;
import com.example.demo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired(required = false)

    private TeacherDao TeacherDao;

    @RequestMapping(value = "tea")
    public String findTeaByName(String tname){
        return TeacherDao.findTeaByName(tname).toString();
    }
}
