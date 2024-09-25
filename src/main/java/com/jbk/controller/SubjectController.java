package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Subject;
import com.jbk.entity.User;
import com.jbk.service.SubjectService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService service;
	
	@PostMapping("/add-subject")
	public ResponseEntity<Integer> addSubject(@RequestBody Subject subject) {
//		String addsubject=service.addSubject(subject);
//		return addsubject;
		Subject registerUser = service.addSubject(subject);
		if (registerUser != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		}
	}
	
	@GetMapping("/get-all-subjects")
	public List<Subject> getAllSubjects(){
		List<Subject> getallsubject=service.getAllSubject();
		return getallsubject;
		
	}
	@GetMapping("/get-subject-by-id/{id}")
	public Object getSubjectById(@PathVariable int id) {
		Object getsubjectbyid=service.getSubjectById(id);
		return getsubjectbyid;
	}
	@PutMapping("/update-subject")
	public String updateSubject(@RequestBody Subject subject) {
		String updatesubject=service.updateSubject(subject);
		return updatesubject;
	}
	
	@DeleteMapping("/delete-subject-by-id/{id}")
	public String deleteSubjectById(@PathVariable int id) {
		String deletesubjectbyid=service.deleteSubjectById(id);
		return deletesubjectbyid;
				
	}
	
}
