package com.example.demo.test;

import com.example.demo.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/a")
    public Student testFeign(){
        int id = 1;
        System.out.println("hahaha");
        Student student = studentService.query(id);
        System.out.println(student);
        return student;
    }
}
