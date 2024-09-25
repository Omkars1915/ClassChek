package com.jbk.service;

import java.util.List;

import com.jbk.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudentById(long id);

	public String updateStudent(Student student);

	public Object deleteStudentById(long id);
	
	

	public List<Student> getStudentbyIds(List<Integer> ids);

	



}
