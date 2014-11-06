package com.demo.model;

import java.util.Set;

/**用户信息
 * @author wobendiankun
 *2014-10-29 下午11:05:26
 */
public class User {
	/**
	 *用户Id 
	 */
	private int userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	
	private Student student ;
	//private Set<Role> roles; 
	
	public User() {
	}
	
	
	public User(int userId) {
		this.userId = userId;
	}
	

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}


	/*public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}*/
	
}
