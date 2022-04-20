package com.example.demo.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.test.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestStudentMapper extends BaseMapper<Student> {
}
