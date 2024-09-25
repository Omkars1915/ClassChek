 package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.AttendanceRecordDTO;
import com.jbk.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendenceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@PostMapping("/take-attendance")
	public String takeAttendance(@RequestBody AttendanceRecordDTO attendance) {
		
		String takeattendance=attendanceService.takeAttendace(attendance);
		
		return takeattendance;
	}
}
