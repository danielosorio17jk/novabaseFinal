package com.novabase.prueba.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novabase.prueba.dto.RequestCuentaCorriente;
import com.novabase.prueba.dto.ResponseCuentaCorriente;
import com.novabase.prueba.service.CuentaCorrienteService;

/**
 * Notación para indicar que es un controlador de tipo Rest
 * 
 * @author daniel
 *
 */
@RestController
@RequestMapping("/cuenta/corriente")
public class CuentaCorrienteControllerRest {

	// Inyección de dependencias
	@Autowired
	private CuentaCorrienteService cuentaCorrienteService;

	static final Logger LOGGER = Logger.getLogger(CuentaCorrienteControllerRest.class);

	@PostMapping("/consultar")
	public ResponseCuentaCorriente consultar(@RequestBody RequestCuentaCorriente request) throws Exception {
		LOGGER.info(request.toString());
		return cuentaCorrienteService.consultarSado(request);
	}
	
	@PostMapping("/consignacion")
	public ResponseCuentaCorriente consignacion(@RequestBody RequestCuentaCorriente request) throws Exception {
		LOGGER.info(request.toString());
		return cuentaCorrienteService.consignar(request);
	}
	
	@PostMapping("/retirar")
	public ResponseCuentaCorriente retirar(@RequestBody RequestCuentaCorriente request) throws Exception {
		LOGGER.info(request.toString());
		return cuentaCorrienteService.retirar(request);
	}

}
