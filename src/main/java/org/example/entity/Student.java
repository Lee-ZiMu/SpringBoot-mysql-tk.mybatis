package org.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Version v1.0
 * @Description:
 * @Author Lee
 * @Date 2023/9/4 17:37
 * @Copyright 李子木
 */
@Data
@Table(name = "student")
public class Student implements Serializable {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 预约id
     */
    @Column(name = "name")
    private String name;

    /**
     * 预约id
     */
    @Column(name = "age")
    private Integer age;
}
