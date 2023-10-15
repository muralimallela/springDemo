package com.example.demo.service;

import com.example.demo.model.ProjectModel;
import com.example.demo.model.StudentModel;

import java.util.List;

public interface ProjectService {
    public ProjectModel addProject(ProjectModel projectModel);
    public List<ProjectModel> projectList();
    public void deleteProjectByID(int id);
}
