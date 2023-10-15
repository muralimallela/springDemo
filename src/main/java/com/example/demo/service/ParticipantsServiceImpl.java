package com.example.demo.service;

import com.example.demo.model.ParticipantsModel;
import com.example.demo.repository.ParticipantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
