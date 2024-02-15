package com.example.model;

import jakarta.persistence.Entity;

@Entity
public class Mecanico extends Persona{
	private Double salario;

	private String turno;

	public Mecanico(){
	}

	public Mecanico(Long nss, String nombre, String direccion, Double salario, String turno) {
		super(nss, nombre, direccion);
		this.salario = salario;
		this.turno = turno;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Mecanico{" +
				"salario=" + salario +
				", turno='" + turno + '\'' +
				'}';
	}
}
