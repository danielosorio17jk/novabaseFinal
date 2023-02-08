package com.novabase.prueba.dto;

import java.util.Date;

public class ResponseCuentaCorriente extends ResponseError{

	private long numeroCuenta;
	private long saldo;
	private Date fecha;
	private String mensaje;

	public long getCuenta() {
		return numeroCuenta;
	}

	public void setCuenta(long cuenta) {
		this.numeroCuenta = cuenta;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "ResponseCuentaAhorro [cuenta=" + numeroCuenta + ", saldo=" + saldo + ", fecha=" + fecha + ", mensaje="
				+ mensaje + "]";
	}

}
