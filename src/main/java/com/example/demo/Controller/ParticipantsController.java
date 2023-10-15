package com.example.demo.Controller;

import com.example.demo.model.ParticipantsModel;
import com.example.demo.model.ProjectModel;
import com.example.demo.service.ParticipantsService;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participants")
public class ParticipantsController {
    @Autowired
    private ParticipantsService participantsService;
    @PostMapping("/add")
    public String addParticipant(@RequestBody ParticipantsModel participantsModel){
        participantsService.addParticipant(participantsModel);
        return "participant added";
    }
    @GetMapping("/getAllParticipants")
    public List<ParticipantsModel> getAllParticipants(){
        return participantsService.participantsList();
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id){
        participantsService.deleteParticipantByID(id);
        return "Participant deleted";
    }
}
