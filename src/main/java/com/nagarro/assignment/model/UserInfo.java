package com.nagarro.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "userinfo")
public class UserInfo {
	
	@Column(name = "fullName")
	private String fullName;
	@Id
	private String username;
	@Column(name = "userPassword")
	private String password;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setName(String name) {
		this.fullName = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserInfo() {}
	@Override
	public String toString() {
		return "UserInfo [name=" + fullName + ", username=" + username + ", password=" + password + "]";
	}
}
