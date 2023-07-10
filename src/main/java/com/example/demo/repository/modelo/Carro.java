package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "carro")
public class Carro {

	@Id
	@SequenceGenerator(name = "seq_carro", sequenceName = "seq_carro", allocationSize = 1)
	@GeneratedValue(generator = "seq_carro", strategy = GenerationType.SEQUENCE)
	@Column(name = "carro_id")
	private Integer id;
	@Column(name = "carro_marca")
	private String marca;
	@Column(name = "carro_modelo")
	private String modelo;
	@Column(name = "carro_anio")
	private String anio;

	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Integer getId() {
		return id;
	}

	// toString
	@Override
	public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
	}

}
