package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos")
public class Tipo {
	@Id
	private String modelo;

	private Integer capacidad;

	private Double peso;

	public Tipo() {
	}

	public Tipo(String modelo, Integer capacidad, Double peso) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.peso = peso;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
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
