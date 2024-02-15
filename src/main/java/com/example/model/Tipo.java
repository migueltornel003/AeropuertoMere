package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long modelo;

	private String capacidad;

	private Double peso;

	public Tipo() {
	}

	public Tipo(Long modelo, String capacidad, Double peso) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.peso = peso;
	}

	public Long getModelo() {
		return modelo;
	}

	public void setModelo(Long modelo) {
		this.modelo = modelo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Tipo{" +
				"modelo=" + modelo +
				", capacidad='" + capacidad + '\'' +
				", peso=" + peso +
				'}';
	}
}
