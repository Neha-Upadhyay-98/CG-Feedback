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
@Table(name = "Admin")
public class Admin {
	
	@Id
	@Column(name="Admin_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String adminId;
	
	@Column(name="Admin_Details", nullable = false)
	@Embedded
	private Employee employee;
	
	@Column(name = "Role")
	private final String role = "Admin";
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Course_Id")
	private List<Course> courseList = new ArrayList<Course>();

	//Constructors
	public Admin(Employee employee, List<Course> courseList) {
		super();
		this.employee = employee;
		this.courseList = courseList;
	}
	
	public Admin() {
		super();
	}

	//Getters & Setters
	
	
	public String getRole() {
		return role;
	}
	
	public String getAdminId() {
		return adminId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Course> getCourse() {
		return courseList;
	}

	public void setCourse(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	@Override
	public String toString() {
		return "Admin [adminId = " + adminId + ", details = " + employee +", role = " + role + ", courseList = " + courseList + "]";
	}

}