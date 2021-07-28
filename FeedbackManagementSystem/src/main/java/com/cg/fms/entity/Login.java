package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	@Column(name="userId", nullable=false)
	private String userid;
	@Column(name="Username", nullable=false)
	private String userName;
	@Column(name="Password", nullable=false)
	private String password;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login() {
		super();
	}
	public Login(String userid, String userName, String password) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [userid=" + userid + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
