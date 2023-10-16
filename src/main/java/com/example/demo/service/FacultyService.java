package com.example.demo.service;

import com.example.demo.model.FacultyModel;
import com.example.demo.model.StudentModel;

import java.util.List;

public interface FacultyService {
    public FacultyModel addFaculty(FacultyModel facultyModel);
    public List<FacultyModel> facultyLIst();
    public void deleteFacultyByID(int id);
    public FacultyModel updateFaculty(int id,FacultyModel facultyModel);
}
