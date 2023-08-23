package com.example.demo.uce.edu.service.to;

import java.math.BigDecimal;

public class TransferenciaTO {

	private String numeroCuentaOrigen;
	private String numeroCuentaDestino;
	private BigDecimal monto;
	
	
	@Override
	public String toString() {
		return "TransferenciaTO [numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino="
				+ numeroCuentaDestino + ", monto=" + monto + "]";
	}
	
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
}
