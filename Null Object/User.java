package com.demo.user;

public class User {
	private int userId ;
	private String userName;
	private Group group;
	
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
	public Group getGroup() {
		//判断返回一个NullGroup对象
		return group==null?NullGroup.createNull():group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
}
