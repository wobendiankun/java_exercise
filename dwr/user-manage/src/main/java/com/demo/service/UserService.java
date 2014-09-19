package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.User;

public class UserService {
	public static final String SUCCESS="success";
	public String add(User user){
		System.out.println(user);
		return SUCCESS;
	}
	public String deleted(int userId){
		throw new RuntimeException("删除出错了...");
	}
	public String update(User user){
		System.out.println("update:"+user);
		return SUCCESS;
	}
	public List<User> list(){
		List<User> users=new ArrayList<User>();
		users.add(new User(1,"aa"));
		users.add(new User(2,"bb"));
		users.add(new User(3,"cc"));
		return users;
	}
}
