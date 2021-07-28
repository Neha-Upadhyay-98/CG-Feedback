package com.cg.fms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer")
public class Trainer {

	@Id
	@Column(name="Trainer_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String trainerId;
	
	@Column(name="Trainer_Details", nullable = false)
	@Embedded
	private Employee employee;
	
	@Column(name = "Role", nullable = false)
	private final String role = "Trainer";
	
	@Column(name = "Skill", nullable = false)
	private String skill;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Feedback_id")
	private List<Feedback> feedback = new ArrayList<Feedback>();
	
	//Constructors
	public Trainer(Employee employee, String skill, List<Feedback> feedback) {
		super();
		this.employee = employee;
		this.skill = skill;
		this.feedback = feedback;
	}

	public Trainer() {
		super();
	}

	//Getters & Setters
	public String getTrainerId() {
		return trainerId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getRole() {
		return role;
	}
	
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public List<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	
	@Override
	public String toString() {
		return "Trainer [trainerId = " + trainerId + ", details = " + employee + ", role = " + role + ", skill = " + skill 
				+ ", feedbacks = " + feedback + "]";
	}
}