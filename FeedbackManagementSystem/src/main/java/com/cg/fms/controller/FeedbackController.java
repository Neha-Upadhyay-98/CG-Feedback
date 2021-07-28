package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entity.Feedback;
import com.cg.fms.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	public FeedbackService feedbackservice;
	
	@PostMapping("/addfeedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return this.feedbackservice.addFeedback(feedback);
	}
	
	@PutMapping("/updatefeedback/{id}")
	public Feedback updateFeedback(@RequestBody Feedback feedback, @PathVariable("id") String feedbackId) {
		return this.feedbackservice.updateFeedback(feedback, feedbackId);
	}
	
	@GetMapping("/gettrainerfeedback/{id}")
	public List<Feedback> viewTrainerFeedbacks(@PathVariable("id") String trainerId) {
		return this.feedbackservice.viewFeedbackByTrainer(trainerId);
	}
	
	@GetMapping("/getprogramfeedback/{id}")
	public List<Feedback> viewProgramFeedbacks(@PathVariable("id") String programid) {
		return this.feedbackservice.viewFeedbackByProgram(programid);
	}
	
}