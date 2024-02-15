package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietarios")
public class Propietario extends Persona{
	private String telf;

	public Propietario(){
	}

	public Propietario(Long nss, String nombre, String direccion, String telf) {
		super(nss, nombre, direccion);
		telf = telf;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		telf = telf;
	}

	@Override
	public String toString() {
		return "Propietario{" +
				"Telf='" + telf + '\'' +
				'}';
	}


}
