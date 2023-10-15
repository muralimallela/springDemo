package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "StudentDetails")
public class StudentModel {
    @Id
    @Column(name = "RollNumber")
    private String rollNumber;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Department")
    private String department;
    @Column(name = "Year")
    private  int year;
    @Column(name = "Batch")
    private String batch;
    @Column(name = "ContactNumber")
    private long contactNumber;
}
