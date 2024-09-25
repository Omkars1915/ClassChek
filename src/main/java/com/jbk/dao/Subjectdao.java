package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Subject;

public interface Subjectdao {

	Subject addSubject(Subject subject);

	List<Subject> getAllSubject();

	Subject getSubjectById(long id);

	String updateSubject(Subject subject);

	String deleteSubjectById(long id);

}
