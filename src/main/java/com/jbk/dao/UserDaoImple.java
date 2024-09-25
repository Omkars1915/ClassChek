package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.User;
import com.jbk.model.LoginRequest;

@Repository
public class UserDaoImple implements UserDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public User addUser(User user) {
		Session session=null;
		try {
			Session openSession = factory.openSession();
			openSession.save(user);
			openSession.beginTransaction().commit();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		Session session=null;
		try {
			Session openSession = factory.openSession();
			Criteria criteria = openSession.createCriteria(User.class);
			List list = criteria.list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

	@Override
	public User getUserById(String name) {
		Session session=null;
		try {
			Session openSession = factory.openSession();
			User user = openSession.get(User.class, name);
			if(user!=null) {
				return user;
				
			}else {
//				return "User id not found";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

	@Override
	public User updateUser(User user) {
		Session session=null;
		try {
			Session openSession = factory.openSession();
			openSession.update(user);
			openSession.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

	@Override
	public User deleteUser(String username) {
		Session session=null;
		try {
			Session openSession = factory.openSession();
			User user = openSession.get(User.class, username);
			
			openSession.delete(user);
			openSession.beginTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

	@Override
	public User loginUser(LoginRequest request) {
		Session session = null;
		User user = null;
		try {
			session = factory.openSession();
			user = session.get(User.class, request.getUsername());
			if (user != null) {
				if (user.getPassword().equals(request.getPassword())) {
					return user;
				}
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}