package org.example.controller;

import org.example.base.BaseController;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version v1.0
 * @Description:
 * @Author Lee
 * @Date 2023/9/4 17:06
 * @Copyright 李子木
 */
@RestController
@RequestMapping("/Student")
public class StudentController extends BaseController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/insert")
    public void insert () {
        Student student = new Student();
        student.setAge(20);
        student.setName("李子木");
        studentService.insert(student);
    }
}
