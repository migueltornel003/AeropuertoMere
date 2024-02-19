package com.example.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tipos")
public class Tipo {
	@Id
	private String modelo;

	private Integer capacidad;

	private Double peso;

	@OneToMany(mappedBy = "tipo")
	private Set<Avion> aviones;

	@ManyToMany
	@JoinTable(name = "pilota",
			joinColumns = @JoinColumn(name = "tipo_modelo"),
			inverseJoinColumns = @JoinColumn(name = "piloto_nss"))
	private Set<Piloto> pilotos = new HashSet<>();


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

	public Set<Avion> getAviones() {
		return aviones;
	}

	public void setAviones(Set<Avion> aviones) {
		this.aviones = aviones;
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
