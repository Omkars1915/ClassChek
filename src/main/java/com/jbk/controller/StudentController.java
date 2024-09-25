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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/add-student")
	public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
		Student registerUser = service.addStudent(student);
		if (registerUser != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		}
	}
	
	@GetMapping("/get-all-students")
	public List<Student> getAllStudent(){
		List<Student> getallstudent=service.getAllStudent();
		return getallstudent;
	}
	
	@GetMapping("/get-student-by-id/{id}")
	public Student getStudentById(@PathVariable long id) {
		Student getstudentbyid=service.getStudentById(id);
		return getstudentbyid;
	} 
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student student) {
		String updatestudent=service.updateStudent(student);
		return updatestudent;
	}
	
	@DeleteMapping("/delete-student-by-id/{id}")
	public Object deleteStudentById(@PathVariable long id) {
		Object deletestudentbyid=service.deleteStudentById(id);
		return deletestudentbyid;
	}
	
	@GetMapping("/get-student-by-ids")
	public List<Student> getStudentByIds(@RequestParam List<Integer> ids){
		List<Student>li=service.getStudentbyIds(ids);
		return li ;
	}
	
	

}
