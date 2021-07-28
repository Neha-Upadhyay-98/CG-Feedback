package com.cg.fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback,String> {
	
	public List<Feedback> viewFeedbackByTrainer(String trainerid);
	public List<Feedback> viewFeedbackByProgram(String programid);

}