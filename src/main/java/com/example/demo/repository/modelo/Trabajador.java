package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "trabajador")
public class Trabajador {

	@Id
	@SequenceGenerator(name = "seq_trabajador", sequenceName = "seq_trabajador", allocationSize = 1)
	@GeneratedValue(generator = "seq_trabajador", strategy = GenerationType.SEQUENCE)
	@Column(name = "trab_id")
	private Integer id;
	@Column(name = "trab_cedula")
	private String cedula;
	@Column(name = "trab_nombre")
	private String nombre;
	@Column(name = "trab_apellido")
	private String apellido;
	@Column(name = "trab_cargo")
	private String cargo;
	
	//toString
	@Override
	public String toString() {
		return "Trabajador \n[id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", cargo=" + cargo + "]";
	}
	
	//Getters y Setters
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getId() {
		return id;
	}
	
}
