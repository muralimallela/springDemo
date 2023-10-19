package com.example.demo.Controller;

import com.example.demo.model.ParticipantsModel;
import com.example.demo.service.ParticipantsService;
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
    @PutMapping("update/{id}")
    public ParticipantsModel updateParticipant(@PathVariable int id, @RequestBody ParticipantsModel participantsModel){
        return participantsService.updateParticipant(id,participantsModel);
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id){
        participantsService.deleteParticipantByID(id);
        return "Participant deleted";
    }
}
