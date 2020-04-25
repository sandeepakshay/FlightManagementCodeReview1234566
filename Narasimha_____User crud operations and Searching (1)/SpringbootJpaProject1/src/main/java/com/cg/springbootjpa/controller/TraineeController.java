package com.cg.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootjpa.exception.TrainerException;
import com.cg.springbootjpa.model.Trainee;
import com.cg.springbootjpa.service.TraineeService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TraineeController {
	
	@Autowired
	TraineeService traineeservice;
	
	@PostMapping("/trainer")
	public ResponseEntity<String> saveBook(@RequestBody Trainee tr) {
		if(tr.getTraineeDomain().contentEquals("MECH")) throw new TrainerException("Mech Department not allowed");
        traineeservice.create(tr);
        
		return new ResponseEntity<String>("Trainer Added",HttpStatus.OK);
	}
	@GetMapping("/gettrainer")
    public ResponseEntity<List<Trainee>> getTrainerlist() {
			List<Trainee> list = traineeservice.reterive();
			return new ResponseEntity<List<Trainee>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteTrainer(@PathVariable("id") int id)
	{
		
		Boolean status = traineeservice.delete(id);
		if(!status)throw new TrainerException("Trainer not found.");
		
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	@GetMapping("/view/{id}")
	public ResponseEntity<Trainee> viewTrainer(@PathVariable("id") int id)
	{
		Trainee tr=traineeservice.findById(id);
		return new ResponseEntity<Trainee>(tr,HttpStatus.OK);
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateTrainer(@PathVariable("id") int id,@RequestBody Trainee tr)
	{
		traineeservice.update(id, tr.getTraineeName(), tr.getTraineeDomain(), tr.getTraineeLocation());
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
