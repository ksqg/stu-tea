package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import java.util.List;

@CrossOrigin
@Controller
public class StudentController {
    @Autowired(required = false)
//    @Autowired()
    private StudentDao StudentDao;

    @RequestMapping(value = "stu")
    @ResponseBody
    public List<Student> showStudentAll(){
        return StudentDao.showAll();

    }
    @RequestMapping(value = "insertstu")
    @ResponseBody
    public String insertStu(String name,String id){
        Student student = new Student();
        student.setId(Integer.valueOf(id));
        student.setName(name);

        int i = StudentDao.insertStu(student);
        System.out.println(i);

        return "success";
    }

    @RequestMapping(value = "updatestu")
    @ResponseBody
    public String updateStu(String name,String id){
        Student student = new Student();
        student.setId(Integer.valueOf(id));
        student.setName(name);

        int i = StudentDao.updateStu(Integer.valueOf(id),name);
        System.out.println(i);

        return "success";
    }

    @RequestMapping(value = "deletestu")
    @ResponseBody
    public String deleteStu(String id){
//        Student student = new Student();
//        student.setId(Integer.valueOf(id));
//        student.setName(name);

        int i = StudentDao.deleteStu(Integer.valueOf(id));
        System.out.println(i);

        return "success";
    }
    @RequestMapping(value = "findStuByName")
    @ResponseBody
    public List<Student> findStuByName(String name){

        return StudentDao.findStuByName(name);
    }

    @RequestMapping(value = "findTeaByStuName")
    @ResponseBody
    public String findTeaByStuName(String name){

        return StudentDao.findTeaByStuName(name).toString();
    }

}
