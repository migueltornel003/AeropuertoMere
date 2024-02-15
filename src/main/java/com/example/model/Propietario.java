package com.example.model;

public class Propietario extends Persona{
	private String Telf;

	public Propietario(){
	}

	public Propietario(Long nss, String nombre, String direccion, String telf) {
		super(nss, nombre, direccion);
		Telf = telf;
	}

	public String getTelf() {
		return Telf;
	}

	public void setTelf(String telf) {
		Telf = telf;
	}

	@Override
	public String toString() {
		return "Propietario{" +
				"Telf='" + Telf + '\'' +
				'}';
	}


}
