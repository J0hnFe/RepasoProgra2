package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PruebaServiceImpl implements IPruebaService {

	@Override
	@Transactional(value = TxType.NEVER)
	public void pruebaNever() {
		System.out.println("Hay transaccion en met. de prueba (NEVER)?: " + TransactionSynchronizationManager.isActualTransactionActive());

	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void pruebaMandatory() {
		System.out.println("Hay transaccion en met. de prueba (MANDATORY)?: " + TransactionSynchronizationManager.isActualTransactionActive());
	}

	@Override
	@Transactional(value = TxType.SUPPORTS)
	public void pruebaSupports() {
		System.out.println("Hay transaccion en met. de prueba (SUPPORTS)?: " + TransactionSynchronizationManager.isActualTransactionActive());
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public void pruebaNotSupported() {
		System.out.println("Hay transaccion en met. de prueba (NOT SUPPORTED)?: " + TransactionSynchronizationManager.isActualTransactionActive());
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void pruebaRequired() {
		System.out.println("Hay transaccion en met. de prueba (REQUIRED)?: " + TransactionSynchronizationManager.isActualTransactionActive());
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void pruebaRequiresNew() {
		System.out.println("Hay transaccion en met. de prueba (REQUIRES NEW)?: " + TransactionSynchronizationManager.isActualTransactionActive());
	}

}
