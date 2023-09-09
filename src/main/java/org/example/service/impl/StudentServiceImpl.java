package org.example.service.impl;

import org.example.base.BaseService;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @Version v1.0
 * @Description:
 * @Author Lee
 * @Date 2023/9/4 17:41
 * @Copyright 李子木
 */
@Service("StudentService")
public class StudentServiceImpl extends BaseService<Student> implements StudentService {
}
