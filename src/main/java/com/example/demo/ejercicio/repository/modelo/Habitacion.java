package com.example.demo.ejercicio.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Habitacion {
	
	@Id
	private Integer id;
	private String numero;
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "habi_id_hotel")
	private Hotel hotel;
	
	//toString
	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero=" + numero + ", valor=" + valor + ", hotel=" + hotel + "]";
	}

	//Getters y Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Integer getId() {
		return id;
	}	
}
