package com.example.model;

import org.hibernate.annotations.NaturalId;

public class Piloto extends Persona{

	@NaturalId
	private Integer n_lic;

	public Piloto() {
	}

	public Piloto(Long nss, String nombre, String direccion, Integer n_lic) {
		super(nss, nombre, direccion);
		this.n_lic = n_lic;
	}

	public Integer getN_lic() {
		return n_lic;
	}

	public void setN_lic(Integer n_lic) {
		this.n_lic = n_lic;
	}

	@Override
	public String toString() {
		return "Piloto{" +
				"n_lic=" + n_lic +
				'}';
	}
}
