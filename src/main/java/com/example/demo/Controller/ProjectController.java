package com.example.demo.Controller;

import com.example.demo.model.ProjectModel;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @PostMapping("/add")
    public String addProject(@RequestBody ProjectModel projectModel){
        projectService.addProject(projectModel);
        return "Project added";
    }
    @GetMapping("/getAllProjects")
    public List<ProjectModel> getAllProjects(){
        return projectService.projectList();
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id){
        projectService.deleteProjectByID(id);
        return "Project deleted";
    }
}
