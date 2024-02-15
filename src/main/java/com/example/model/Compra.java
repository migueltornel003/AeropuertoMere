package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "compra")
public class Compra{
	@Column(name = "fech_compra")
	private LocalDate fechCompra;
}
