package com.example.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "mantiene")
public class Mantiene {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_trab",insertable = false,updatable = false)
	private Long codTrab;

	@Id
	@Column(name = "avion_n_registro",insertable = false,updatable = false)
	private String avionNRegistro;

	@Id
	@Column(name = "mecanico_nss",insertable = false,updatable = false)
	private String mecanicoNss;

	private LocalDate fecha;
	@Column(name = "n_horas")
	private Integer nHoras;

	public Mantiene() {
	}

	public Mantiene(Long codTrab, String avionNRegistro, String mecanicoNss, LocalDate fecha, Integer nHoras) {
		this.codTrab = codTrab;
		this.avionNRegistro = avionNRegistro;
		this.mecanicoNss = mecanicoNss;
		this.fecha = fecha;
		this.nHoras = nHoras;
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

	public String getAvionNRegistro() {
		return avionNRegistro;
	}

	public void setAvionNRegistro(String avionNRegistro) {
		this.avionNRegistro = avionNRegistro;
	}

	public String getMecanicoNss() {
		return mecanicoNss;
	}

	public void setMecanicoNss(String mecanicoNss) {
		this.mecanicoNss = mecanicoNss;
	}

	@Override
	public String toString() {
		return "Mantiene{" +
				"codTrab=" + codTrab +
				", avionNRegistro='" + avionNRegistro + '\'' +
				", mecanicoNss='" + mecanicoNss + '\'' +
				", fecha=" + fecha +
				", nHoras=" + nHoras +
				'}';
	}
}
