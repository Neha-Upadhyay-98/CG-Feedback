package com.cg.fms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Participant")
public class Participant {
	
	@Id
	@Column(name="Participant_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String participantId;
	
	@Column(name="Details", nullable = false)
	@Embedded
	private Employee employee;
	
	@Column(name = "Role")
	private final String role = "Participant";

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Feedback_id")
	private Feedback feedback;
	
	//Constructors
	public Participant(Employee employee, Feedback feedback) {
		super();
		this.employee = employee;
		this.feedback = feedback;
	}
	public Participant() {
		super();
	}
	
	//Getter & Setters
	public String getRole() {
		return role;
	}
	public String getParticipantId() {
		return participantId;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Feedback getFeedback() {
		return feedback;
	}
	
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
	@Override
	public String toString() {
		return "Participant [participantId = " + participantId + ", details = " + employee +", role = " + role + ", feedbacks = " + feedback + "]";
	}

}