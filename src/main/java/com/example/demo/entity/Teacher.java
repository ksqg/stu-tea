package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

//序列化
public class Teacher implements Serializable {
    private int tid;
    private String tname;
    private List<Student> student;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Teacher(){}

    public Teacher(int tid, String tname, List<Student> student) {
        this.tid = tid;
        this.tname = tname;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", student=" + student +
                '}';
    }


}

