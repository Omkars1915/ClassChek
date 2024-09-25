package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Student;

public interface StudentDao {
	
	public Student addStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudentById(long id);

	public String updateStudent(Student student);

	public Object deleteStudentById(long id);

	public List<Student> getAllStudentbyIds(List<Integer> ids);

	

}
