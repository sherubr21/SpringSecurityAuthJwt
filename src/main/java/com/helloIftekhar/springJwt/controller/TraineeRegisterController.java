package com.helloIftekhar.springJwt.controller;

import com.helloIftekhar.springJwt.model.Trainee;
import com.helloIftekhar.springJwt.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TraineeRegisterController {
    @Autowired
    private TraineeService traineeService;
    @PostMapping("/trainee_register")

    public Trainee register(@RequestBody Trainee trainee){
        return traineeService.saveTrainee(trainee);

    }

}
