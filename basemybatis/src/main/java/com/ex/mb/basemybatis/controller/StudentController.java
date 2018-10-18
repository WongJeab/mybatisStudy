package com.ex.mb.basemybatis.controller;

import com.ex.mb.basemybatis.entity.Student;
import com.ex.mb.basemybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<Student> queryStudentAll(){
        return studentService.queryStudentAll();
    }


    @RequestMapping("queryStudentById")
    @ResponseBody
    public Student queryStudentAll(@RequestParam Integer id){
        return studentService.queryStudentById(id);
    }

}
