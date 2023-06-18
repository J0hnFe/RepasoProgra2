package com.example.demo.ejercicio.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("impar")
public class CalculoImparServiceImpl implements ICalculoExtra{

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		return new BigDecimal(0);
	}

}
