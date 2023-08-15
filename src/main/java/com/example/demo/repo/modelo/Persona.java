package com.example.demo.repo.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @SequenceGenerator(name = "seq_persona", sequenceName = "seq_persona", allocationSize = 1)
    @GeneratedValue(generator = "seq_persona", strategy = GenerationType.SEQUENCE)
    @Column(name = "pers_id")
    private Integer id;
    @Column(name = "pers_nombre")
    private String nombre;
    @Column(name = "pers_cedula")
    private String cedula;
    @Column(name = "pers_fecha_nacimiento")
    private LocalDate fechaNacimiento;

    //Getters y Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //toString
    @Override
    public String toString() {
        return "Persona [cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", id=" + id + ", nombre="
                + nombre + "]";
    }
    
}
