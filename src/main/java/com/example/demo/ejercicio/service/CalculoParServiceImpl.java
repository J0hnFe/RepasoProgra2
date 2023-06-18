package com.example.demo.ejercicio.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("par")
public class CalculoParServiceImpl implements ICalculoExtra{

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		BigDecimal extra = precio.multiply(new BigDecimal(0.05));
		return extra;
	}
}
