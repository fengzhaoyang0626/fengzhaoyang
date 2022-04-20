package com.snowy.southwind.controller;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.snowy.southwind.feign.Student;
import com.snowy.southwind.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @Autowired
    TestFeign testFeign;
    @RequestMapping(value = "/q")
//    @HystrixCommand(fallbackMethod = "fallback")
    public Student aaa(){
        Student student = testFeign.testfeign();
        return student;
    }
    public Student fallback() {
        System.out.println("throwable.getMessage()");
        return new Student();
    }
}
