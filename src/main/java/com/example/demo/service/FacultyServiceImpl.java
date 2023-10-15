package com.example.demo.service;

import com.example.demo.model.FacultyModel;
import com.example.demo.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService{

    @Autowired
    private FacultyRepository facultyRepository;
    @Override
    public FacultyModel addFaculty(FacultyModel facultyModel) {
        return facultyRepository.save(facultyModel);
    }

    @Override
    public List<FacultyModel> facultyLIst() {
        return facultyRepository.findAll();
    }

    @Override
    public void deleteFacultyByID(int id) {
        facultyRepository.deleteById(id);
    }
}
