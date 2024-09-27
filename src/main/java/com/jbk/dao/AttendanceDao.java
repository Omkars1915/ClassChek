package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Attendance;

public interface AttendanceDao {
	
	public Attendance takeAttendance(Attendance attendance);

	public List<Attendance> viewAttendance();

}
