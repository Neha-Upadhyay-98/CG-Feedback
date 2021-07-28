package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entity.Trainer;
import com.cg.fms.service.TrainerManagementService;


@RestController
@RequestMapping("/trainer")
public class TrainerManagementController {
	
	@Autowired
	public TrainerManagementService trainermanagementservice;
	
	@PostMapping("/addtrainer")
	public Trainer addTrainer(@RequestBody Trainer trainer) {
		return this.trainermanagementservice.addTrainer(trainer);
	}
	
	@PutMapping("/updatetrainer/{id}")
	public Trainer updateTrainer(@RequestBody Trainer trainer, @PathVariable("id") String trainerId) {
		return this.updateTrainer(trainer, trainerId);
	}
	
	@DeleteMapping("/deletetrainer/{id}")
	public ResponseEntity <Trainer> removeTrainer(@PathVariable("id") String trainerId) {
		return this.trainermanagementservice.removeTrainer(trainerId);
	}
	
	@GetMapping("/viewalltrainer")
	public List<Trainer> viewAllTrainer() {
		return this.trainermanagementservice.viewAllTrainer();
	}
	
	@GetMapping("/viewtrainerbyid/{id}")
	public Trainer viewTrainer(@PathVariable("id") String trainerId) {
		return this.trainermanagementservice.viewTrainer(trainerId);
	}
	
	@GetMapping("/viewalltrainerbyskill/{skill}")
	public List<Trainer> viewAllTrainerBySkill(@PathVariable("skill") String skill){
		return this.trainermanagementservice.viewAllTrainerBySkill(skill);
	}

}