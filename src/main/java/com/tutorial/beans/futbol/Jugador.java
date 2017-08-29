package com.tutorial.beans.futbol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tutorial.interfaces.IEquipo;

public class Jugador {

	private String nombre; 
	private String numero;
	@Autowired
	@Qualifier("barcelonaQualifier")
	private IEquipo equipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	} 
	
}
