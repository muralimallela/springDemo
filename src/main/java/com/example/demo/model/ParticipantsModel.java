package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParticipantsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long participantID;

    @ManyToOne
    @JoinColumn(name = "ProjectID", referencedColumnName = "projectID")
    private ProjectModel project;

    @ManyToOne
    @JoinColumn(name = "StudentID", referencedColumnName = "rollNumber")
    private StudentModel student;
}
