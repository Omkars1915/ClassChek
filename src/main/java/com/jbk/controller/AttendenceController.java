 package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Attendance;
import com.jbk.model.AttendanceRecordDTO;
import com.jbk.service.AttendanceService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/attendance")
public class AttendenceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@PostMapping("/take-attendance")
	public Attendance takeAttendance(@RequestBody AttendanceRecordDTO attendance) {
		return attendanceService.takeAttendace(attendance);
	}
	
	@GetMapping("/view-attendance")
	public List<Attendance> viewAttendance(){
		return attendanceService.viewAttendance();
	}
}
