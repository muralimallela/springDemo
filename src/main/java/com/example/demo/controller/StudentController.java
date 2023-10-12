package com.example.demo.controller;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentModel studentModel){
        studentService.addStudent(studentModel);
        return "Student added";
    }
    @GetMapping("/getStudents")
    public List<StudentModel> getAllStudents(){
        return studentService.listStudents();
    }

    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable Integer sid){
        studentService.deleteStudentById(sid);
        return "Student deleted";
    }


}
