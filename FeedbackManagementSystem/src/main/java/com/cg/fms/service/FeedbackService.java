package com.cg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.entity.Feedback;
import com.cg.fms.repository.IFeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	IFeedbackRepository feedbackrepository;
	
	public Feedback addFeedback(Feedback fdb) {
		return feedbackrepository.save(fdb);
	}

	public Feedback updateFeedback(Feedback fdb, String feedbackId) {
		Feedback result = this.feedbackrepository.getById(feedbackId);
		result.setComments(fdb.getComments());
		result.setFeedbackCriteria1(fdb.getFeedbackCriteria1());
		result.setFeedbackCriteria2(fdb.getFeedbackCriteria2());
		result.setFeedbackCriteria3(fdb.getFeedbackCriteria3());
		result.setFeedbackCriteria4(fdb.getFeedbackCriteria4());
		result.setFeedbackCriteria5(fdb.getFeedbackCriteria5());
		result.setProgram(fdb.getProgram());
		result.setSuggestions(fdb.getSuggestions());
		result.setTrainer(fdb.getTrainer());
		return this.feedbackrepository.save(result);
	}
	
	public List<Feedback> viewFeedbackByTrainer(String trainerid) {
		return feedbackrepository.viewFeedbackByTrainer(trainerid);
	}

	public List<Feedback> viewFeedbackByProgram(String programid) {
		return feedbackrepository.viewFeedbackByProgram(programid);
	}

}