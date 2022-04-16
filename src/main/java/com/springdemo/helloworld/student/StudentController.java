package com.springdemo.helloworld.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/student")
public class StudentController {
   StudentService studentService=new StudentService();



    @GetMapping
    public List<Student> getStudents(){
        return  studentService.getStudents();
    }



}