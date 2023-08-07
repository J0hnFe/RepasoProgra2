package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.repository.IPropietarioRepo;
import com.example.demo.repository.modelo.Propietario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	
	@Autowired
	private IPropietarioRepo propietarioRepo;
	
	@Autowired
	private IPruebaService pruebaService;

	@Override
	@Transactional //Digo que esto sea una transaccion
	public void agregar(Propietario p) {
		
		System.out.println("Hay transaccion en el service?: " + TransactionSynchronizationManager.isActualTransactionActive());
		
//		this.propietarioRepo.insertar(p);
//		this.prueba();
//		this.pruebaService.pruebaNever();
//		this.pruebaService.pruebaMandatory();
//		this.pruebaService.pruebaSupports();
//		this.pruebaService.pruebaNotSupported();
		this.pruebaService.pruebaRequired();
//		this.pruebaService.pruebaRequiresNew();
	}

	@Override
	public Propietario buscar(String cedula) {
		return this.propietarioRepo.seleccionar(cedula);
	}
	
	@Transactional(value = TxType.NEVER) //Al estar dentro de otro transactional, el que se aplica es el del padre
	public void prueba() {
		System.out.println("Hay transaccion en met. de prueba (NEVER) (dentro del PropServImpl)?: " + TransactionSynchronizationManager.isActualTransactionActive());
	}

}
