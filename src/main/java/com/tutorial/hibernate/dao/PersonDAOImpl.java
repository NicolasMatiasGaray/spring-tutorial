package com.tutorial.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutorial.hibernate.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Person p) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Person> list() {
		Session session = sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}

}
