package com.novabase.prueba.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novabase.prueba.dto.RequestCadena;
import com.novabase.prueba.dto.ResponseCadena;
import com.novabase.prueba.service.CadenaService;

/**
 * Notación para indicar que es un controlador de tipo Rest
 * 
 * @author daniel
 *
 */
@RestController
@RequestMapping("/cadena")
public class CadenaControllerRest {

	/*
	 * Inyección de dependencias
	 */
	@Autowired
	private CadenaService cadena;

	/**
	 * Se le indica el tipo de petición asi como el nombre del servicio
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/minusculas")
	public ResponseCadena minusculas(@RequestBody RequestCadena insert) throws Exception {
		ResponseCadena responseCadena = new ResponseCadena();
		responseCadena = cadena.minusculas(insert);
		return responseCadena;
	}

	/**
	 * Se le indica el tipo de petición asi como el nombre del servicio
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/mayusculas")
	public ResponseCadena mayusculas(@RequestBody RequestCadena insert) throws Exception {
		return cadena.mayusculas(insert);
	}

	/**
	 * Se le indica el tipo de petición asi como el nombre del servicio
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/dosprimeros")
	public ResponseCadena dosPrimeros(@RequestBody RequestCadena insert) throws Exception {
		return cadena.dosPrimeros(insert);
	}

	/**
	 * Se le indica el tipo de petición asi como el nombre del servicio
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/dosultimos")
	public ResponseCadena dosUltimos(@RequestBody RequestCadena insert) throws Exception {
		return cadena.dosUltimos(insert);
	}

	/**
	 * Se le indica el tipo de petición asi como el nombre del servicio
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/ocurrencias")
	public ResponseCadena ocurrencias(@RequestBody RequestCadena insert) throws Exception {
		return cadena.ocurrencias(insert);
	}

	/**
	 * Se le indica el tipo de petición asi como el nombre del servicio
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/asteriscos")
	public ResponseCadena asteriscos(@RequestBody RequestCadena insert) throws Exception {
		return cadena.asteriscos(insert);
	}

	/**
	 * Se le indica el tipo de petición asi como el nombre del servicio
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/invertida")
	public ResponseCadena invertida(@RequestBody RequestCadena insert) throws Exception {
		return cadena.invertida(insert);
	}
}
