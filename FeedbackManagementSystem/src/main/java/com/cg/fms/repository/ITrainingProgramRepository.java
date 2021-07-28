package com.cg.fms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Program;

@Repository
public interface ITrainingProgramRepository extends JpaRepository<Program, String> {

	public List<Program> viewAllProgramsByDate(LocalDate date);
	public List<Program> viewAllProgramsByTrainer(String trainerid);
}

