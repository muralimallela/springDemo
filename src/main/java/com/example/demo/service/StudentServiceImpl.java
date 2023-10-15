package com.example.demo.service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentModel addStudent(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

    @Override
    public List<StudentModel> studentList() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentByID(String id) {
        studentRepository.deleteById(id);
    }
}
