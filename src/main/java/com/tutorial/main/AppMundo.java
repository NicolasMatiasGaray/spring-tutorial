package com.tutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.beans.AppConfig;
import com.tutorial.beans.Mundo;

public class AppMundo {

	public static void main(String[] args) {
		
		// Code with XML	
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tutorial/xml/beans.xml");
		Mundo mundo = appContext.getBean(Mundo.class);
		System.out.println(mundo.getSaludo());
		// Releasing appContext
		((ConfigurableApplicationContext)appContext).close();
	
		// Code with Annotations
		appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		mundo = appContext.getBean(Mundo.class);
		System.out.println(mundo.getSaludo());
		// Releasing appContext
		((ConfigurableApplicationContext)appContext).close();
	
	}

}
