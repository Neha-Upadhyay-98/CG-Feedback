package com.cg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.fms.entity.Trainer;
import com.cg.fms.exception.TrainerNotFoundException;
import com.cg.fms.repository.ITrainerManagementRepository;

@Service
public class TrainerManagementService {

	@Autowired
	private ITrainerManagementRepository trainermanagementrepository;
	
	public Trainer addTrainer(Trainer trainer) {
		return trainermanagementrepository.save(trainer);
	}

	public Trainer updateTrainer(Trainer trainer, String trainerId) {
		Trainer existingtrainer = this.trainermanagementrepository.getById(trainerId);
		existingtrainer.setEmployee(trainer.getEmployee());
		existingtrainer.setSkill(trainer.getSkill());
		return this.trainermanagementrepository.save(existingtrainer);
	}

	public ResponseEntity <Trainer> removeTrainer(String trainerId) {
		Trainer existingtrainer = this.trainermanagementrepository.findById(trainerId)
				.orElseThrow(() -> new TrainerNotFoundException("Trainer not found with id " + trainerId));
		this.trainermanagementrepository.delete(existingtrainer);
		return ResponseEntity.ok().build();
	}

	public List<Trainer> viewAllTrainer() {
		return this.trainermanagementrepository.findAll();
	}
	
	public Trainer viewTrainer(String trainerId) {
		return this.trainermanagementrepository.findById(trainerId)
				.orElseThrow(() -> new TrainerNotFoundException("Trainer not found with id " + trainerId));
	}

	public List <Trainer> viewAllTrainerBySkill(String Skill) {
		return this.trainermanagementrepository.viewAllTrainerBySkill(Skill);
	}

}