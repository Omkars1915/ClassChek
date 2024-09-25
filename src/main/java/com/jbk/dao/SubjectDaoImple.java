package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Subject;

@Repository
public class SubjectDaoImple implements Subjectdao {

	@Autowired
	private SessionFactory factory;

	@Override
	public Subject addSubject(Subject subject) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			Session openSession = factory.openSession();
			openSession.save(subject);
			openSession.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			Session openSession = factory.openSession();
			Criteria criteria = openSession.createCriteria(Subject.class);
			List list = criteria.list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}

	@Override
	public Subject getSubjectById(long id) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			Session openSession = factory.openSession();
			Subject subject = openSession.get(Subject.class, id);
			if(subject!=null) {
				return subject;
			}else {
//				return "Subject not found";
			}
//			return subject;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}

	@Override
	public String updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			Session openSession = factory.openSession();
			openSession.update(subject);
			openSession.beginTransaction().commit();
			return "Subject update Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}

	@Override
	public String deleteSubjectById(long id) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			Session openSession = factory.openSession();
			Subject subject = openSession.get(Subject.class, id);
			if(subject==null) {
				return "Subject not found for delete";
			}
			openSession.delete(subject);
			openSession.beginTransaction().commit();
			return "Subject delete Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}
	
}
