package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IUniversidadRepo;
import com.example.demo.repository.modelo.Departamento;
import com.example.demo.repository.modelo.Universidad;

@Service
public class UniversidadServiceImpl implements IUniversidadService{

	@Autowired
	private IUniversidadRepo universidadRepo;
	
	@Override
	public void agregar(Universidad u) {
		this.universidadRepo.insertar(u);
	}

	@Override
	public List<Universidad> buscarInnerJoin() {
		return this.universidadRepo.seleccionarInnerJoin();
	}
	
	@Override
	public List<Departamento> buscarDptoInnerJoin() {
		return this.universidadRepo.seleccionarDptoInnerJoin();
	}

	@Override
	public List<Universidad> buscarOuterRightJoin() {
		return this.universidadRepo.seleccionarOuterRightJoin();
	}

	@Override
	public List<Departamento> buscarDptoOuterRightJoin() {
		return this.universidadRepo.seleccionarDptoOuterRightJoin();
	}

	@Override
	public List<Universidad> buscarOuterLeftJoin() {
		return this.universidadRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Departamento> buscarDptoOuterLeftJoin() {
		return this.universidadRepo.seleccionarDptoOuterLeftJoin();
	}

	@Override
	public List<Universidad> buscarOuterFullJoin() {
		return this.universidadRepo.seleccionarOuterFullJoin();
	}

	@Override
	public List<Departamento> buscarDptoOuterFullJoin() {
		return this.universidadRepo.seleccionarDptoOuterFullJoin();
	}

	@Override
	public List<Universidad> buscarWhereJoin() {
		return this.universidadRepo.seleccionarWhereJoin();
	}

	@Override
	public List<Departamento> buscarDptoWhereJoin() {
		return this.universidadRepo.seleccionarDptoWhereJoin();
	}

}
