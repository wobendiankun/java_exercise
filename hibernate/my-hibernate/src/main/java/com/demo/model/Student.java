package com.demo.model;

import java.io.UnsupportedEncodingException;
import java.util.Set;

/**学生信息
 * @author wobendiankun
 *2014-10-19 下午08:54:29
 */
public class Student {
	private int studentId ;
	private String studentName ;
	private int age;
	private Set<Certificate> certificates ;
	private User user;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		String str="";
		if(studentName!=null){
			try {
				str=new String(studentName.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return "Student [studentId=" + studentId + ", studentName="
				+ str + ", age=" + age + "]";
	}
	public Set<Certificate> getCertificates() {
		return certificates;
	}
	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
