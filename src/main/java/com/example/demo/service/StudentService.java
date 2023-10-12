package com.example.demo.service;

import com.example.demo.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public StudentModel addStudent(StudentModel studentModel);
    public List<StudentModel> studentList();
    public void deleteStudentByID(int id);
}
