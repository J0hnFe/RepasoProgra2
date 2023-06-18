package com.example.demo.ejercicio.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta")
public class CtaBancaria {
	
	@Id
	@GeneratedValue(generator = "seq_cta", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cta", sequenceName = "seq_cta", allocationSize = 1)
	private Integer id;
	@Column(name = "cta_id")
	private String numero;
	@Column(name = "cta_tipo")
	private String tipo;
	@Column(name = "cta_fecha")
	private LocalDate fechaApertura;
	@Column(name = "cta_saldo")
	private BigDecimal saldo;
	@Column(name = "cta_cedula")
	private String cedulaPropietario;
	
	//toString
	@Override
	public String toString() {
		return "CtaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura
				+ ", saldo=" + saldo + ", cedulaPropietario=" + cedulaPropietario + "]";
	}
	
	//Getters y Setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	public Integer getId() {
		return id;
	}
}
