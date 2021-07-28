package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	
	@Column(name = "Course_Id", nullable=false)
	private String courseId;
	
	@Column(name = "Course_Name", nullable=false)
	private String courseName;
	
	@Column(name = "Course_Description", nullable=false)
	private String courseDescription;
	
	@Column(name = "Course_Duration", nullable=false)
	private int noOfDays;
	
	//Constructors
	public Course(String courseId, String courseName, String courseDescription, int noOfDays) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.noOfDays = noOfDays;
	}
	public Course() {
		super();
	}
	
	//Getters & Setters
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	@Override
	public String toString() {
		return "Course [courseId = " + courseId + ", courseName = " + courseName + ", courseDescription = " + courseDescription +
				", courseDuration = " + noOfDays + "]";
	}
}