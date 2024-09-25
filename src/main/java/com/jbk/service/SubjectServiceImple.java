package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.Subjectdao;
import com.jbk.entity.Student;
import com.jbk.entity.Subject;

@Service
public class SubjectServiceImple implements SubjectService {

	@Autowired
	private Subjectdao dao;

	@Override
	public Subject addSubject(Subject subject) {
		// TODO Auto-generated method stub
	
		return dao.addSubject(subject);
	}

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		List<Subject> getallsubject=dao.getAllSubject();
		return getallsubject;
	}

	@Override
	public Subject getSubjectById(long id) {
		// TODO Auto-generated method stub
		Subject getsubjectbyid=dao.getSubjectById(id);
		return getsubjectbyid;
	}

	@Override
	public String updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		String updatesubject=dao.updateSubject(subject);
		return updatesubject;
	}

	@Override
	public String deleteSubjectById(long id) {
		// TODO Auto-generated method stub
		String deletesubjectbyid=dao.deleteSubjectById(id);
		return deletesubjectbyid;
	}
	
}
