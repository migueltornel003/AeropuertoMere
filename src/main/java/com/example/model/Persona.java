package com.example.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "personas")
public class Persona {
	@Id
	private Long nss;

	private String nombre;

	private String direccion;

	public Persona() {
	}

	public Persona(Long nss, String nombre, String direccion) {
		this.nss = nss;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Long getNss() {
		return nss;
	}

	public void setNss(Long nss) {
		this.nss = nss;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona{" +
				"Nss=" + nss +
				", nombre='" + nombre + '\'' +
				", direccion='" + direccion + '\'' +
				'}';
	}
}
