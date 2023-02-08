package com.novabase.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Notación para indicar que es una entidad
@Entity
//Tabla que corresponde a esta entidad
@Table(name = "CUENTASCORRIENTES")
public class CuentaCorriente {

	@Column(name = "nombres", length = 30)
	private String nombres;
	
	@Column(name = "apellidos", length = 30)
	private String apellidos;
	
	@Column(name = "edad")
	private int edad;
	
	@Id
	private long numeroCuenta;
	
	@Column(name = "saldo")
	private long saldo;
	
	

	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(String nombres, String apellidos, int edad, long numeroCuenta, long saldo) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public CuentaCorriente(long numeroCuenta, long saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	
}