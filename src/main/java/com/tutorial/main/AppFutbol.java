package com.tutorial.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.beans.futbol.Jugador;
import com.tutorial.beans.futbol.ManchesterUnited;

public class AppFutbol {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tutorial/xml/beansFutbol.xml");
		
		Jugador jugador = appContext.getBean(Jugador.class);
		System.out.println(jugador.getNombre() + " - " + jugador.getEquipo().mostrar());
		
		jugador.setEquipo(appContext.getBean(ManchesterUnited.class));
		System.out.println(jugador.getNombre() + " - " + jugador.getEquipo().mostrar());
		
		jugador = appContext.getBean(Jugador.class);
		jugador.getEquipo().mostrar();
		System.out.println(jugador.getNombre() + " - " + jugador.getEquipo().mostrar());
		
		// Releasing appContext
		((ConfigurableApplicationContext)appContext).close();
	}

}
