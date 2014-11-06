package com.demo.model;

import java.util.Set;

/**角色信息
 * @author wobendiankun
 *2014-11-2 下午08:29:54
 */
public class Role {
	/**
	 * 角色id
	 */
	private int roleId;
	/**
	 * 角色名称
	 */
	private String roleName;
	private Set<User> users;
	
	public Role() {
	}
	
	public Role(int roleId) {
		this.roleId = roleId;
	}
	
	public Role(String roleName) {
		this.roleName = roleName;
	}

	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
