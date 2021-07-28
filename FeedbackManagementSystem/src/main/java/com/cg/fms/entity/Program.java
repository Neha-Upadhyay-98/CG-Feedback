package com.cg.fms.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Program")
public class Program {

	@Id
	@Column(name = "Program_Id", nullable=false)
	private String programId;

	@Column(name = "Start_Date", nullable=false)
	private LocalDate startDate;

	@Column(name = "End_Date", nullable=false)
	private LocalDate endDate;

	/*
	 * relation between training program and course
	 * one program can have many courses also one course can be present in different programs 
	 */
	@Column(name = "Course_List", nullable=false)
	@ManyToMany(targetEntity = Course.class, mappedBy = "Course_Id", fetch = FetchType.EAGER)
	private List<Course> courseList;

	/*
	 * relation between training program and trainer
	 * a program can have many trainers as well as a trainer can be assigned to different programs
	 */
	@Column(name = "Trainer_List", nullable=false)
	@ManyToMany(targetEntity = Trainer.class, mappedBy = "Trainer_Id", fetch = FetchType.EAGER)
	private List<Trainer> trainerList;
	
	
	/*
	 * relation between training program and participants
	 * a program can have many participants and a participant can join different programs
	 */
	@Column(name = "Participant_List", nullable=false)
	@ManyToMany(targetEntity = Participant.class, mappedBy = "Participant_Id", fetch = FetchType.EAGER)
	private List<Participant> participantList;

	/*
	 * relation between training program and feedback 
	 * one program can have many feedbacks
	 */
	@Column(name="Feedback_List", nullable = false)
	@OneToMany(targetEntity = Feedback.class, mappedBy = "Feedback_Id", fetch = FetchType.LAZY)
	private List<Feedback> feedbackList;

	/*
	 * Default Constructor
	 */
	public Program() {
		super();
	}

	/*
	 * Parameterized Constructor
	 */
	public Program(String programId, LocalDate startDate, LocalDate endDate, List<Course> courseList,
			List<Trainer> trainerList, List<Participant> participantList, List<Feedback> feedbackList) {
		super();
		this.programId = programId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseList = courseList;
		this.trainerList = trainerList;
		this.participantList = participantList;
		this.feedbackList = feedbackList;
	}
	
	/*
	 * Getters and Setters
	 */
	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public List<Trainer> getTrainerList() {
		return trainerList;
	}

	public void setTrainerList(List<Trainer> trainerList) {
		this.trainerList = trainerList;
	}

	public List<Participant> getParticipantList() {
		return participantList;
	}

	public void setParticipantList(List<Participant> participantList) {
		this.participantList = participantList;
	}

	public List<Feedback> getFeedbackList() {
		return feedbackList;
	}

	public void setFeedbackList(List<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}
	
	@Override
	public String toString() {
		return "Program [programId=" + programId + ", startdate=" + startDate + ", enddate=" + endDate + 
				", courseList=" + courseList + ", trainerList=" + trainerList + ", participantList=" + participantList + 
				", feedbackList=" + feedbackList + "]";
	}
	
}