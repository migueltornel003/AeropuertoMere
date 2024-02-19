package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "propietarios")
public class Propietario extends Persona{
	private String telf;

	@ManyToMany(mappedBy = "propietarios")
	private Set<Avion> aviones = new HashSet<>();

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
