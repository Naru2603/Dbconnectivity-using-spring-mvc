package com.infosys.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	SessionFactory sessionFactory;
	 
	public void saveEmployeeToDb(Employee e) {
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		session.save(e);
		txn.commit();
		session.close();
	}
}
