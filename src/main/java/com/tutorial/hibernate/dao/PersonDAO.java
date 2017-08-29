package com.tutorial.hibernate.dao;

import java.util.List;
import com.tutorial.hibernate.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}