package com.example.demo.service;

import com.example.demo.model.ProjectModel;
import com.example.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public ProjectModel addProject(ProjectModel projectModel) {
        return projectRepository.save(projectModel);
    }

    @Override
    public List<ProjectModel> projectList() {
        return projectRepository.findAll();
    }

    @Override
    public void deleteProjectByID(int id) {
        projectRepository.deleteById(id);
    }
}
