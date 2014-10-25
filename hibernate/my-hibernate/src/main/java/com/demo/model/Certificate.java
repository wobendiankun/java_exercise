package com.demo.model;

/**从业资格证书
 * @author wobendiankun
 *2014-10-25 上午11:43:21
 */
public class Certificate {
	/**
	 * 证书id
	 */
	private int certificateId ;
	/**
	 * 证书名称
	 */
	private String certificateName;
	/**
	 *证书编号
	 */
	private String certificateNo ;
	
	private Student student ;
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
