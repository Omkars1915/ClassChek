package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	
	@Id
	private long subjectId;
	private String subjectName;
	private String subjectCode;
	private int credits;
	private String department;
	
	
	// Default constructor
	public Subject() {
	}

	// Parameterized constructor
	public Subject(long subjectId, String subjectName, String subjectCode, int credits, String department) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectCode = subjectCode;
		this.credits = credits;
		this.department = department;
	}

	// Getters and Setters
	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectCode=" + subjectCode
				+ ", credits=" + credits + ", department=" + department + "]";
	}
}
