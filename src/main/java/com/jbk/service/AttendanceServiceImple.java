package com.jbk.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.AttendanceDao;
import com.jbk.entity.Attendance;
import com.jbk.model.AttendanceRecordDTO;
@Service
public class AttendanceServiceImple implements AttendanceService {

	@Autowired
	private SubjectService subjectService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AttendanceDao attendanceDao;
	
	
	@Override
	public Attendance takeAttendace(AttendanceRecordDTO attendanceRecordDTO) {
		String id = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		attendanceRecordDTO.setId(id);
		
		Attendance attendace=new Attendance();
		attendace.setId(id);
		attendace.setDate(attendanceRecordDTO.getDate( ));
		attendace.setTime(attendanceRecordDTO.getTime());
		attendace.setCounts(attendanceRecordDTO.getRollNo().size());
		
		
		attendace.setSubject(subjectService.getSubjectById(attendanceRecordDTO.getSubId()));
		attendace.setUsername(userService.getUserById(attendanceRecordDTO.getUsername()));
		attendace.setstudents(studentService.getStudentbyIds(attendanceRecordDTO.getRollNo()));
		System.out.println(attendanceRecordDTO.getSubId());
		return attendanceDao.takeAttendance(attendace);
	}


	@Override
	public List<Attendance> viewAttendance() {
		
		return attendanceDao.viewAttendance();
	}

}
