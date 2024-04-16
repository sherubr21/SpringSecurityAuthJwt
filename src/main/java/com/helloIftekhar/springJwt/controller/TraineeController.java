package com.helloIftekhar.springJwt.controller;

import com.helloIftekhar.springJwt.model.Trainee;
import com.helloIftekhar.springJwt.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainee")
@CrossOrigin
public class TraineeController {
    @Autowired
    private TraineeService traineeService;

    @PostMapping("/add")
    public Trainee add(@RequestBody Trainee trainee) {

        return traineeService.saveTrainee(trainee);
    }

    @GetMapping("/getall")
    public List<Trainee> list() {
        return traineeService.getTrainee();
    }

    @PutMapping("/update/{id}")
    //  public String pem(String id){
    // public ResponseEntity<Trainee> update(@PathVariable Integer id, @RequestBody Trainee trainee)
    public ResponseEntity<Trainee> update(@PathVariable Integer id,@RequestBody Trainee trainee){
        Trainee updatedTrainee = traineeService.updateTrainee(id, trainee);
        if (updatedTrainee != null) {
            return ResponseEntity.ok(updatedTrainee); // Return 200 OK with the updated trainee
        } else {
            return ResponseEntity.notFound().build(); // Return 404 Not Found if trainee with given ID not found
        }
        // return "kkk";
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        traineeService.deleteT(id);

    }

}
