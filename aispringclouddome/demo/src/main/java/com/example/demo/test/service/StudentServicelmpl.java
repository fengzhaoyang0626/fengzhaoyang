package com.example.demo.test.service;

import com.example.demo.test.Student;
import com.example.demo.test.dao.TestStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServicelmpl implements StudentService{
    @Autowired
    TestStudentMapper testStudentMapper;

    @Override
    public Student query(Integer id) {
        Student student = testStudentMapper.selectById(id);
        return student;
    }
}
