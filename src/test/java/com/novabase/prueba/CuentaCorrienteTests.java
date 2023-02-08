package com.novabase.prueba;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.novabase.prueba.controller.CuentaCorrienteControllerRest;
import com.novabase.prueba.dto.RequestCuentaCorriente;
import com.novabase.prueba.dto.ResponseCuentaCorriente;
import com.novabase.prueba.model.CuentaCorriente;
import com.novabase.prueba.repositories.ICuentaCorrienteRepo;
import com.novabase.prueba.service.CuentaCorrienteService;

@SpringBootTest
public class CuentaCorrienteTests {
	
	@Autowired
	CuentaCorrienteService cuentaCorrienteService;
	
	@Autowired
	CuentaCorrienteControllerRest cuentaCorrienteControllerRest = new CuentaCorrienteControllerRest();
	
	ICuentaCorrienteRepo iCuentaCorrienteRepoMock = Mockito.mock(ICuentaCorrienteRepo.class);
	
	static final Logger LOGGER = Logger.getLogger(CuentaCorrienteTests.class);
	
	
	
	@BeforeEach
	void setUp() {
		Optional<CuentaCorriente> cuentaCorriente = Optional.ofNullable(new CuentaCorriente("daniel fernando", "osorio cedeno", 24, 12345678, 800));
		
		Mockito.when(iCuentaCorrienteRepoMock.findById((long) 12345678)).thenReturn(cuentaCorriente);
	}
	
	//@Test
	void consutar() throws Exception {
		RequestCuentaCorriente requestCuentaCorriente = new RequestCuentaCorriente();
		requestCuentaCorriente.setNumeroCuenta(12345678);
		LOGGER.info(requestCuentaCorriente);
		
		ResponseCuentaCorriente responseCuentaCorriente = new ResponseCuentaCorriente();
		responseCuentaCorriente.setSaldo(0);
		responseCuentaCorriente.setCuenta(0);
		responseCuentaCorriente.setFecha(null);
		responseCuentaCorriente.setMensaje("Error en la transaccion");
		responseCuentaCorriente.setTransaccionExito(0);
		
		LOGGER.info(responseCuentaCorriente);
		
		Assertions.assertEquals(cuentaCorrienteControllerRest.consultar(requestCuentaCorriente), responseCuentaCorriente);
		
	}
	
	@AfterEach
	void tearDown() {
		
	}
	


}
