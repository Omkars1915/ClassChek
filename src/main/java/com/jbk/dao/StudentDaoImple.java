package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;

@Repository
public class StudentDaoImple implements StudentDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Session openSession=null;
		try {
			 openSession = factory.openSession();
			openSession.save(student);
			openSession.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		Session openSession=null;
		try {
			openSession = factory.openSession();
			Criteria criteria = openSession.createCriteria(Student.class);
			List list = criteria.list();
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		Session openSession=null;
		try {
			openSession= factory.openSession();
			Student student = openSession.get(Student.class, id);
			if(student!=null) {
			return student;
			}else {
//				return "Student data not found";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		Session openSession=null;
		try {
			openSession = factory.openSession();
			openSession.update(student);
			openSession.beginTransaction().commit();
			return "Update Successfully";
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		return null;
	}

	@Override
	public Object deleteStudentById(long id) {
		// TODO Auto-generated method stub
	
		Session openSession=null;
		try {
			openSession = factory.openSession();
			Student student = openSession.get(Student.class, id);
			if(student==null) {
				return "Student data not found for delete";
			}
			
			openSession.delete(student);
			openSession.beginTransaction().commit();
			
			return "Delete Successfully";
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		return null;
	}

	@Override
	public List<Student> getAllStudentbyIds(List<Integer> list) {
		Session openSession=null;
		List<Student>  studentList=null;
		try {
			openSession = factory.openSession();
			studentList = openSession.byMultipleIds(Student.class).multiLoad(list);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		return studentList;
	}

}
