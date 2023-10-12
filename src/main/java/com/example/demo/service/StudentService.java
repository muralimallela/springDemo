package com.example.demo.service;

import com.example.demo.model.StudentModel;

import java.util.List;

public interface StudentService {
    public StudentModel addStudent(StudentModel studentModel);
    public List<StudentModel> listStudents();
    public void deleteStudentById(int sid);
}
