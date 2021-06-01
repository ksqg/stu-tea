package com.example.demo.dao;

import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {
    public List<Teacher> findTeaByName(@Param(value="tname")String tname);
}
