package com.cg.fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Trainer;

@Repository
public interface ITrainerManagementRepository extends JpaRepository<Trainer, String>{

	public List <Trainer> viewAllTrainerBySkill(String skill);
	
}