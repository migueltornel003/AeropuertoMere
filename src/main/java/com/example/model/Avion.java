package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;

@Entity
public class Avion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long n_registro;

	@NaturalId
	private String matricula;

	private LocalDate fecha_reg;

	private LocalDate fecha_construccion;

	public Avion(){
	}

	public Avion(Long n_registro, String matricula, LocalDate fecha_reg, LocalDate fecha_construccion) {
		this.n_registro = n_registro;
		this.matricula = matricula;
		this.fecha_reg = fecha_reg;
		this.fecha_construccion = fecha_construccion;
	}

	public Long getN_registro() {
		return n_registro;
	}

	public void setN_registro(Long n_registro) {
		this.n_registro = n_registro;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getFecha_reg() {
		return fecha_reg;
	}

	public void setFecha_reg(LocalDate fecha_reg) {
		this.fecha_reg = fecha_reg;
	}

	public LocalDate getFecha_construccion() {
		return fecha_construccion;
	}

	public void setFecha_construccion(LocalDate fecha_construccion) {
		this.fecha_construccion = fecha_construccion;
	}

	@Override
	public String toString() {
		return "Avion{" +
				"n_registro=" + n_registro +
				", matricula='" + matricula + '\'' +
				", fecha_reg=" + fecha_reg +
				", fecha_construccion=" + fecha_construccion +
				'}';
	}
}
