package com.tutorial.hibernate.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.hibernate.dao.PersonDAO;
import com.tutorial.hibernate.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/xml/beans-hibernate.xml");
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("Nicolas Garay"); person.setCountry("Argentina");
		
		personDAO.save(person);
		
		System.out.println("Person::"+person);
		
		List<Person> list = personDAO.list();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		
		context.close();	
	}
}
