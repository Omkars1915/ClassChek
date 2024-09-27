package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Attendance;
import com.jbk.entity.Student;
import com.jbk.model.AttendanceRecordDTO;

@Repository
public class AttendanceDaoImpl implements AttendanceDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public Attendance takeAttendance(Attendance attendance) {
		Session session=null;
		
		try {
			session=factory.openSession();
			session.save(attendance);
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			 
		}
		return null;
	}

	@Override
	public List<Attendance> viewAttendance() {
		Session openSession=null;
		List<Attendance> list=null;
		try {
			openSession = factory.openSession();
			Criteria criteria = openSession.createCriteria(Attendance.class);
			list = criteria.list();
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

}
