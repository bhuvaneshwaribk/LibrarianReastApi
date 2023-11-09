package com.bitlabs.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentBarnch;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int studentId, String studentName, String studentEmail, String studentBarnch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentBarnch = studentBarnch;
	}
	
	
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
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentBarnch() {
		return studentBarnch;
	}
	public void setStudentBarnch(String studentBarnch) {
		this.studentBarnch = studentBarnch;
	}
	
	
	
	
}
