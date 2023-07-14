package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Departamento;
import com.example.demo.repository.modelo.Universidad;

public interface IUniversidadService {
	
	public void agregar(Universidad u);
	
	public List<Universidad> buscarInnerJoin();
	public List<Departamento> buscarDptoInnerJoin();
	
	public List<Universidad> buscarOuterRightJoin();
	public List<Departamento> buscarDptoOuterRightJoin();
	
	public List<Universidad> buscarOuterLeftJoin();
	public List<Departamento> buscarDptoOuterLeftJoin();
	
	public List<Universidad> buscarOuterFullJoin();
	public List<Departamento> buscarDptoOuterFullJoin();
	
	public List<Universidad> buscarWhereJoin();
	public List<Departamento> buscarDptoWhereJoin();

}
