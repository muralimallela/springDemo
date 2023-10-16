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

    @Override
    public FacultyModel updateFaculty(int id, FacultyModel facultyModel) {
        FacultyModel faculty = facultyRepository.findById(id).orElseThrow(()->new RuntimeException());
        faculty.setFirstName(facultyModel.getFirstName());
        faculty.setLastName(facultyModel.getLastName());
        faculty.setEmail(facultyModel.getEmail());
        faculty.setDepartment(facultyModel.getDepartment());
        faculty.setContactNumber(facultyModel.getContactNumber());
        return facultyRepository.save(faculty);
    }
}
