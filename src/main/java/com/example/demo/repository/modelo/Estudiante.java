package com.example.demo.repository.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")

@NamedQuery(name = "Estudiante.buscarPorApellidoNamed", query = "SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido")
@NamedQuery(name = "Estudiante.buscarPorNombreNamed", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre")

@NamedNativeQuery(name = "Estudiante.buscarPorApellidoNative", query = "SELECT * FROM estudiante WHERE  estu_apellido = :datoApellido", resultClass = Estudiante.class)
@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "SELECT * FROM estudiante WHERE  estu_nombre = :datoNombre", resultClass = Estudiante.class)

//Otra forma (ya no muy usada) de declarar varios queries

//@NamedQueries({
//	@NamedQuery(name = "Estudiante.buscarPorApellidoNamed", query = "SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido"),
//	@NamedQuery(name = "Estudiante.buscarPorNombreNamed", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre")
//})
//
//@NamedNativeQueries({
//	@NamedNativeQuery(name = "Estudiante.buscarPorApellidoNative", query = "SELECT * FROM estudiante WHERE  estu_apellido = :datoApellido", resultClass = Estudiante.class),
//	@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "SELECT * FROM estudiante WHERE  estu_nombre = :datoNombre", resultClass = Estudiante.class)
//
//})
public class Estudiante {

	@Id
	@SequenceGenerator(name = "seq_estudiante", sequenceName = "seq_estudiante", allocationSize = 1)
	@GeneratedValue(generator = "seq_estudiante", strategy = GenerationType.SEQUENCE)
	@Column(name = "estu_id")
	private Integer id;
	@Column(name = "estu_cedula")
	private String cedula;
	@Column(name = "estu_nombre")
	private String nombre;
	@Column(name = "estu_apellido")
	private String apellido;
	
	//toString
	@Override
	public String toString() {
		return "Estudiante \n[id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
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
	public Integer getId() {
		return id;
	}

}
