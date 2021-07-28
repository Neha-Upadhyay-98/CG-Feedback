package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Feedback_Id", nullable = false)
	private String feedbackId;

	@Column(name = "Participant_Info", nullable = false)
	private Participant participant;
	
	@Column(name = "Trainer_Info", nullable = false)
	private Trainer trainer;
	
	@Column(name = "Program_Info", nullable = false)
	private Program program;
	
	@Column(name = "Feedback_Criteria_1", nullable = false)
	private int feedbackCriteria1;
	
	@Column(name = "Feedback_Criteria_2", nullable = false)
	private int feedbackCriteria2;
	
	@Column(name = "Feedback_Criteria_3", nullable = false)
	private int feedbackCriteria3;
	
	@Column(name = "Feedback_Criteria_4", nullable = false)
	private int feedbackCriteria4;
	
	@Column(name = "Feedback_Criteria_5", nullable = false)
	private int feedbackCriteria5;
	
	@Column(name = "Comments", nullable = false)
	private String comments;
	
	@Column(name = "Suggestions", nullable = false)
	private String suggestions;
	
	// Default Constructor
	public Feedback() {
		super();
	}

	// Parameterised Constructor Final
	public Feedback(Participant participant, Trainer trainer, Program program, int feedbackCriteria1,
			int feedbackCriteria2, int feedbackCriteria3, int feedbackCriteria4, int feedbackCriteria5, String comments,
			String suggestions) {
		super();
		this.participant = participant;
		this.trainer = trainer;
		this.program = program;
		this.feedbackCriteria1 = feedbackCriteria1;
		this.feedbackCriteria2 = feedbackCriteria2;
		this.feedbackCriteria3 = feedbackCriteria3;
		this.feedbackCriteria4 = feedbackCriteria4;
		this.feedbackCriteria5 = feedbackCriteria5;
		this.comments = comments;
		this.suggestions = suggestions;
	}
	
	// Getters and Setters
	public String getFeedbackId() {
		return feedbackId;
	}
	public Participant getParticipant() {
		return participant;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public int getFeedbackCriteria1() {
		return feedbackCriteria1;
	}
	public void setFeedbackCriteria1(int feedbackCriteria1) {
		this.feedbackCriteria1 = feedbackCriteria1;
	}
	public int getFeedbackCriteria2() {
		return feedbackCriteria2;
	}
	public void setFeedbackCriteria2(int feedbackCriteria2) {
		this.feedbackCriteria2 = feedbackCriteria2;
	}
	public int getFeedbackCriteria3() {
		return feedbackCriteria3;
	}
	public void setFeedbackCriteria3(int feedbackCriteria3) {
		this.feedbackCriteria3 = feedbackCriteria3;
	}
	public int getFeedbackCriteria4() {
		return feedbackCriteria4;
	}
	public void setFeedbackCriteria4(int feedbackCriteria4) {
		this.feedbackCriteria4 = feedbackCriteria4;
	}
	public int getFeedbackCriteria5() {
		return feedbackCriteria5;
	}
	public void setFeedbackCriteria5(int feedbackCriteria5) {
		this.feedbackCriteria5 = feedbackCriteria5;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", participantInfo=" + participant + ", trainerInfo=" + trainer + 
				", programInfo=" + program + ", feedbackCriteria1=" + feedbackCriteria1 + ", feedbackCriteria2=" + feedbackCriteria2 + 
				", feedbackCriteria3=" + feedbackCriteria3 + ", feedbackCriteria4=" + feedbackCriteria4 + 
				", feedbackCriteria5=" + feedbackCriteria5 + ", comments=" + comments + ", suggestions=" + suggestions +"]";
	}
	
}