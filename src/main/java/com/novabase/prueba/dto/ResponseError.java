package com.novabase.prueba.dto;

public class ResponseError {

	private String error;
	private int transaccionExito;
	private String mesaje;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getTransaccionExito() {
		return transaccionExito;
	}

	public void setTransaccionExito(int transaccionExito) {
		this.transaccionExito = transaccionExito;
	}

	public String getMesaje() {
		return mesaje;
	}

	public void setMesaje(String mesaje) {
		this.mesaje = mesaje;
	}

}
