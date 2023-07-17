package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Departamento;
import com.example.demo.repository.modelo.Universidad;

public interface IUniversidadRepo {
	
	public void insertar(Universidad u);
	
	public List<Universidad> seleccionarInnerJoin();
	public List<Departamento> seleccionarDptoInnerJoin();
	
	public List<Universidad> seleccionarOuterRightJoin();
	public List<Departamento> seleccionarDptoOuterRightJoin();
	
	public List<Universidad> seleccionarOuterLeftJoin();
	public List<Departamento> seleccionarDptoOuterLeftJoin();
	
	public List<Universidad> seleccionarOuterFullJoin();
	public List<Departamento> seleccionarDptoOuterFullJoin();
	
	public List<Universidad> seleccionarWhereJoin();
	public List<Departamento> seleccionarDptoWhereJoin();
	
	public List<Universidad> seleccionarFetchJoin();
	public List<Departamento> seleccionarDptoFetchJoin();

}
