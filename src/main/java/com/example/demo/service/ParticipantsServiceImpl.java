package com.example.demo.service;

import com.example.demo.model.FacultyModel;
import com.example.demo.model.ParticipantsModel;
import com.example.demo.repository.ParticipantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantsServiceImpl implements ParticipantsService{
    @Autowired
    private ParticipantsRepository participantsRepository;
    @Override
    public ParticipantsModel addParticipant(ParticipantsModel participantsModel) {

        return participantsRepository.save(participantsModel);
    }

    @Override
    public List<ParticipantsModel> participantsList() {

        return participantsRepository.findAll();
    }

    @Override
    public void deleteParticipantByID(int id) {
        participantsRepository.deleteById(id);
    }

    @Override
    public ParticipantsModel updateParticipant(int id, ParticipantsModel participantsModel) {
        ParticipantsModel participant = participantsRepository.findById(id).orElseThrow(()->new RuntimeException());
        participant.setStudent(participantsModel.getStudent());
        participant.setProject(participantsModel.getProject());
        return participantsModel;
    }
}
