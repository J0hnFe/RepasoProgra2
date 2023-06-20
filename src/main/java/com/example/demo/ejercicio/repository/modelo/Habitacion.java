package com.example.demo.ejercicio.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitacion")
public class Habitacion {
	
	@Id
	@GeneratedValue(generator = "seq_hab", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_hab", sequenceName = "seq_hab", allocationSize = 1)
	private Integer id;
	@Column(name = "hab_numero")
	private String numero;
	@Column(name = "hab_valor")
	private BigDecimal valor;
	
	@ManyToOne(cascade = CascadeType.ALL)
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
