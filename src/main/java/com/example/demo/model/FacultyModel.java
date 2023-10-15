package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FacultyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facultyID;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String contactNumber;

//    @OneToMany(mappedBy = "faculty", cascade = CascadeType.REMOVE)
//    private List<ProjectModel> projects;
}
