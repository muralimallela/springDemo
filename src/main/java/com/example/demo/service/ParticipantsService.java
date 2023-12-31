package com.example.demo.service;

import com.example.demo.model.FacultyModel;
import com.example.demo.model.ParticipantsModel;

import java.util.List;

public interface ParticipantsService {
    public ParticipantsModel addParticipant(ParticipantsModel participantsModel);
    public List<ParticipantsModel> participantsList();
    public void deleteParticipantByID(int id);
    public ParticipantsModel updateParticipant(int id, ParticipantsModel participantsModel);
}
