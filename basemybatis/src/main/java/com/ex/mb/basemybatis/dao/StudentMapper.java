package com.ex.mb.basemybatis.dao;

import com.ex.mb.basemybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    Student queryStudentById(Integer id);

    List<Student> queryStudentByName(String name);

    void updateStudentById(Student student);

    int insertStudent(Student student);

    void deleteStudentById(Integer id);

    List<Student> queryStudentAll();

}
