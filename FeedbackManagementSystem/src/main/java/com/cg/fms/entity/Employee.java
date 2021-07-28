package com.cg.fms.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Employee {
	
	private String empName;
	private String password;
	
	//constructors
	public Employee() {
		super();
	}

	public Employee(String empName, String password) {
		super();
		
		this.empName = empName;
		this.password = password;
	}
	//Getters and Setters
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employee [empName =" + empName + ", password =" + password +"]";
	}
			
}