package com.example.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "mantiene")
public class Mantiene {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_trab")
	private Long codTrab;
	private LocalDate fecha;
	@Column(name = "n_horas")
	private Integer nHoras;

	public Mantiene() {
	}

	public Long getCodTrab() {
		return codTrab;
	}

	public void setCodTrab(Long codTrab) {
		this.codTrab = codTrab;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getnHoras() {
		return nHoras;
	}

	public void setnHoras(Integer nHoras) {
		this.nHoras = nHoras;
	}

	@Override
	public String toString() {
		return "Mantiene{" +
				"codTrab=" + codTrab +
				", fecha=" + fecha +
				", nHoras=" + nHoras +
				'}';
	}
}
