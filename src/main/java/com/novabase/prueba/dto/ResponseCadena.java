package com.novabase.prueba.dto;

public class ResponseCadena {

	private int s_Exito;
	private String Cadena;
	private String error;

	public ResponseCadena() {
		super();
	}

	public int getS_Exito() {
		return s_Exito;
	}

	public void setS_Exito(int s_Exito) {
		this.s_Exito = s_Exito;
	}

	public String getCadena() {
		return Cadena;
	}

	public void setCadena(String cadena) {
		Cadena = cadena;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "ResponseCadena [s_Exito=" + s_Exito + ", Cadena=" + Cadena + ", error=" + error + "]";
	}
}
