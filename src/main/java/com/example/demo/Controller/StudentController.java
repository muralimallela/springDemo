package com.example.demo.Controller;

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
    @GetMapping("/getAllStudents")
    public List<StudentModel> getAllStudents(){
        return studentService.studentList();
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable String id){
        studentService.deleteStudentByID(id);
        return "Student deleted";
    }

}
