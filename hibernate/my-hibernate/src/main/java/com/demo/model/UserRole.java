package com.demo.model;

import java.util.Set;

/**用户角色关系
 * @author wobendiankun
 *2014-11-6 下午10:33:34
 */
public class UserRole {
	private int userRoleId;
	private String operator;
	private User user;
	private Role role;
	
	public UserRole() {
	}
	public UserRole(String operator) {
		this.operator = operator;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	
}
