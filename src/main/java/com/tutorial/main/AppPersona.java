package com.tutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.beans.Persona;

public class AppPersona {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tutorial/xml/beans.xml");
		Persona persona = appContext.getBean(Persona.class);
		System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getPais().getNombre() + " " + persona.getCiudad().getNombre());
		// Releasing appContext
		((ConfigurableApplicationContext)appContext).close();
		
	}
}
