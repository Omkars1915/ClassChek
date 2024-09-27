package com.jbk.service;

import java.util.List;

import com.jbk.entity.Attendance;
import com.jbk.model.AttendanceRecordDTO;

public interface AttendanceService {
	
	public Attendance takeAttendace(AttendanceRecordDTO attendance);

	public List<Attendance> viewAttendance();

}
