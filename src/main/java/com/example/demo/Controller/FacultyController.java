package com.example.demo.Controller;

import com.example.demo.model.FacultyModel;
import com.example.demo.model.StudentModel;
import com.example.demo.service.FacultyService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;
    @PostMapping("/add")
    public String addStudent(@RequestBody FacultyModel facultyModel){
        facultyService.addFaculty(facultyModel);
        return "Faculty added";
    }
    @GetMapping("/getAllFaculty")
    public List<FacultyModel> getAllStudents(){
        return facultyService.facultyLIst();
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id){
        facultyService.deleteFacultyByID(id);
        return "Faculty deleted";
    }
}
