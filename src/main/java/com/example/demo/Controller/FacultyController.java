package com.example.demo.Controller;

import com.example.demo.model.FacultyModel;
import com.example.demo.service.FacultyService;
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
    @PutMapping("update/{id}")
    public FacultyModel updateFaculty(@PathVariable int id,@RequestBody FacultyModel facultyModel){
        return facultyService.updateFaculty(id,facultyModel);
    }
}
