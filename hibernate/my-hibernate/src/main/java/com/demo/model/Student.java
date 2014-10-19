package com.demo.model;

import java.io.UnsupportedEncodingException;

/**学生实体类
 * @author wobendiankun
 *2014-10-19 下午08:54:29
 */
public class Student {
	private int studentId ;
	private String studentName ;
	private int age;
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
	
}
