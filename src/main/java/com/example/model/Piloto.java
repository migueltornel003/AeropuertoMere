package com.example.model;

import jakarta.persistence.Column;
import org.hibernate.annotations.NaturalId;

public class Piloto extends Persona{

	@NaturalId
	@Column(name = "n_lic")
	private Integer nLic;

	public Piloto() {
	}

	public Piloto(Long nss, String nombre, String direccion, Integer n_lic) {
		super(nss, nombre, direccion);
		this.nLic = n_lic;
	}

	public Integer getN_lic() {
		return nLic;
	}

	public void setN_lic(Integer n_lic) {
		this.nLic = n_lic;
	}

	@Override
	public String toString() {
		return "Piloto{" +
				"n_lic=" + nLic +
				'}';
	}
}
