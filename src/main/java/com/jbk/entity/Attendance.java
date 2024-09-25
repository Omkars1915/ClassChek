package com.jbk.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Attendance {
	@Id
	private String id;
	
	private String date;
	private String time;
	private int counts;
	

	@ManyToOne
	@JoinColumn(name = "username")
	private User username;
	
	@ManyToOne
	@JoinColumn(name="subject")
	private Subject subject;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
		name="attendance_student",
		joinColumns = @JoinColumn(name = "attendance_record_id"),
		inverseJoinColumns =@JoinColumn(name = "stuednt_id") )
	private List<Student> students;
	
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(String id, String date, String time, int counts, List<Student> students, User username,
			Subject subject) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.counts = counts;
		this.students = students;
		this.username = username;
		this.subject = subject;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public List<Student> getstudents() {
		return students;
	}
	public void setstudents(List<Student> students) {
		this.students = students;
	}
	public User getUsername() {
		return username;
	}
	public void setUsername(User username) {
		this.username = username;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Attendance [id=" + id + ", date=" + date + ", time=" + time + ", counts=" + counts + ", students="
				+ students + ", username=" + username + ", subject=" + subject + "]";
	}
	
	
	
}
