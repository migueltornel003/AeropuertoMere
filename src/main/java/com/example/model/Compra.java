package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "compra")
public class Compra{

	@Id
	@Column(name = "avion_n_registro",insertable = false,updatable = false)
	private String avionNRegistro;

	@Id
	@Column(name = "propietario_nss",insertable = false,updatable = false)
	private String propietarionNss;

	@Column(name = "fech_compra")
	private LocalDate fechCompra;

	public Compra() {
	}

	public Compra(String avionNRegistro, String propietarionNss, LocalDate fechCompra) {
		this.avionNRegistro = avionNRegistro;
		this.propietarionNss = propietarionNss;
		this.fechCompra = fechCompra;
	}

	public String getAvionNRegistro() {
		return avionNRegistro;
	}

	public void setAvionNRegistro(String avionNRegistro) {
		this.avionNRegistro = avionNRegistro;
	}

	public String getPropietarionNss() {
		return propietarionNss;
	}

	public void setPropietarionNss(String propietarionNss) {
		this.propietarionNss = propietarionNss;
	}

	public LocalDate getFechCompra() {
		return fechCompra;
	}

	public void setFechCompra(LocalDate fechCompra) {
		this.fechCompra = fechCompra;
	}

	@Override
	public String toString() {
		return "Compra{" +
				"avionNRegistro='" + avionNRegistro + '\'' +
				", propietarionNss='" + propietarionNss + '\'' +
				", fechCompra=" + fechCompra +
				'}';
	}
}
