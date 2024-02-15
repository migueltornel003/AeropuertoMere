package com.example.model;

import jakarta.persistence.*;

@Entity
public class Hangar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_hangar")
	private Long codHangar;

	private Integer capacidad;

	private String localizacion;

	public Hangar() {
	}

	public Hangar(Long codHangar, Integer capacidad, String localizacion) {
		this.codHangar = codHangar;
		this.capacidad = capacidad;
		this.localizacion = localizacion;
	}

	public Long getCodHangar() {
		return codHangar;
	}

	public void setCodHangar(Long codHangar) {
		this.codHangar = codHangar;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	@Override
	public String toString() {
		return "Hangar{" +
				"codHangar=" + codHangar +
				", capacidad=" + capacidad +
				", localizacion='" + localizacion + '\'' +
				'}';
	}
}
