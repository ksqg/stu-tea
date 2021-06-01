package com.example.demo.dao;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import  java.util.List;

@Mapper
public interface StudentDao {

    public List<Student> showAll();

    public int insertStu(Student s);

    public int updateStu(@Param(value="id")int id,@Param(value="name")String name);

    public int deleteStu(int id);

    public List<Student> findStuByName(@Param(value="name")String name);

    public List<Student> findTeaByStuName(@Param(value="name")String name);
}
