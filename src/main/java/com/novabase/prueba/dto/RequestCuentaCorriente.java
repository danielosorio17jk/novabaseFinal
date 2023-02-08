package com.novabase.prueba.dto;

public class RequestCuentaCorriente {
	
	private long numeroCuenta;
	
	private long valor;

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "RequestCuentaAhorro [numeroCuenta=" + numeroCuenta + ", valor=" + valor + "]";
	}
	
	

}
