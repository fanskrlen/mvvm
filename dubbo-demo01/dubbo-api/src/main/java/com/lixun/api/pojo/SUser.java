package com.lixun.api.pojo;

import java.io.Serializable;

/**
 * (SUser)实体类
 *
 * @author makejava
 * @since 2020-11-24 10:36:22
 */
public class SUser implements Serializable {
    private static final long serialVersionUID = -50014091008639726L;
    /**
    * 学生编号
    */
    private Integer id;
    /**
    * 学生姓名
    */
    private String name;
    /**
    * 性别
    */
    private String sex;
    /**
    * 年龄
    */
    private Integer age;
    /**
    * 班级编号
    */
    private Integer classroomId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

}