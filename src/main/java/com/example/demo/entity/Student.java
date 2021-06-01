package com.example.demo.entity;
import com.example.demo.entity.Teacher;
public class Student {
    private int id;
    private String name;
    private Teacher teachers;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(){}

    public Teacher getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }

    public Student(int id, String name, Teacher teachers) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
