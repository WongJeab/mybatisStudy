package com.ex.mb.basemybatis.service;

import com.ex.mb.basemybatis.entity.Student;

import java.util.List;

public interface StudentService {
    Student queryStudentById(Integer id);

    List<Student> queryStudentByName(String name);

    boolean updateStudentById(Student student);

    int insertStudent(Student student);

    boolean deleteStudentById(Integer id);

    List<Student> queryStudentAll();
}
