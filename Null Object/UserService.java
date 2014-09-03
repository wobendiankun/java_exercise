package com.demo.user;

public class UserService {
	public void add(User user){
		//获取groupId
		int  groupId=user.getGroup().getGroupId();
		//doing something
	}
}
