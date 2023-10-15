package com.example.demo.repository;

import com.example.demo.model.ParticipantsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantsRepository extends JpaRepository<ParticipantsModel,Integer> {
}
