package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.StudentDao;
import com.jbk.entity.Student;

@Service
public class StudentServiceImple implements StudentService {
	@Autowired
	private StudentDao dao;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		
		return dao.addStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> getallstudent=dao.getAllStudent();
		return getallstudent;
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		Student getstudentbyid=dao.getStudentById(id);
		return getstudentbyid;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		String updatestudent=dao.updateStudent(student);
	
		return updatestudent;
	}

	@Override
	public Object deleteStudentById(long id) {
		// TODO Auto-generated method stub
		Object deletestudentbyid=dao.deleteStudentById(id);
		return deletestudentbyid;
	}


	@Override
	public List<Student> getStudentbyIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		List<Student> getbyids=dao.getAllStudentbyIds(ids);
		return getbyids;
	}
}
