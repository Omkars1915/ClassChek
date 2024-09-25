package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.Subjectdao;
import com.jbk.entity.Subject;


public interface SubjectService {

	public Subject addSubject(Subject subject);

	public List<Subject> getAllSubject();

	public Subject getSubjectById(long id);

	public String updateSubject(Subject subject);

	public String deleteSubjectById(long id);

//	Object getSubjectById(long id);
//
//	String deleteSubjectById(long id);
	
	

}
