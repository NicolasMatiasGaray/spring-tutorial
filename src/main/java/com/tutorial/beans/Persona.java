package com.tutorial.beans;

public class Persona {

	private String nombre; 
	private String apellido; 
	private Pais pais;
	private Ciudad ciudad; 
	
	private void init() {
		System.out.println("Inicializando Objeto de Clase " + Persona.class);
	}
	
	private void destroy() {
		System.out.println("Destruyendo Objeto de Clase " + Persona.class);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	} 
}
