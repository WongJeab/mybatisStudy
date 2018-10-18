package com.ex.mb.basemybatis.service.Impl;

import com.ex.mb.basemybatis.dao.StudentMapper;
import com.ex.mb.basemybatis.entity.Student;
import com.ex.mb.basemybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public List<Student> queryStudentByName(String name) {
        return studentMapper.queryStudentByName(name);
    }

    @Override
    public boolean updateStudentById(Student student) {
        boolean bool = true;
        try {
            studentMapper.updateStudentById(student);
            bool = true;
        }catch (Exception e){
            e.printStackTrace();
            bool =false;
        }
        return bool;
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public boolean deleteStudentById(Integer id) {
        boolean bool=false;
        try {
            studentMapper.deleteStudentById(id);
            bool = true;
        }catch (Exception e){
            e.printStackTrace();
            bool = false;
        }
        return bool;
    }

    @Override
    public List<Student> queryStudentAll() {
        return studentMapper.queryStudentAll();
    }
}
