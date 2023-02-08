package com.novabase.prueba.service;

import java.util.Optional;

//mport java.util.Date;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novabase.prueba.dto.RequestCuentaCorriente;
import com.novabase.prueba.dto.ResponseCuentaCorriente;
import com.novabase.prueba.model.CuentaCorriente;
import com.novabase.prueba.repositories.ICuentaCorrienteRepo;

//Notación para indicar que es un servicio
@Service
//Asegura que toda la data requerida este segura hasta que la transacción termine
@Transactional
public class CuentaCorrienteService {

	static final Logger LOGGER = Logger.getLogger(CuentaCorrienteService.class);

	@Autowired
	private ICuentaCorrienteRepo repo;

	public ResponseCuentaCorriente consultarSado(RequestCuentaCorriente cuentaAhorro) {

		ResponseCuentaCorriente response = new ResponseCuentaCorriente();
		CuentaCorriente cuentaCorriente = new CuentaCorriente();
		LOGGER.info("Se procede a validar cuenta");

		try {
			Optional<CuentaCorriente> cuenta = repo.findById(cuentaAhorro.getNumeroCuenta());
			cuentaCorriente = cuenta.get();

			response.setCuenta(cuentaCorriente.getNumeroCuenta());
			response.setSaldo(cuentaCorriente.getSaldo());
			response.setTransaccionExito(1);
			response.setMensaje("Transaccion exitosa");
			return response;
		} catch (Exception e) {
			LOGGER.error(e);
			response.setTransaccionExito(0);
			response.setError(e.toString());
			response.setMensaje("Error en la transaccion");
			// response.setFecha(new Date);
			return response;

		}
	}

	public ResponseCuentaCorriente consignar(RequestCuentaCorriente cuentaAhorro) {

		ResponseCuentaCorriente response = new ResponseCuentaCorriente();
		CuentaCorriente cuentaCorriente = new CuentaCorriente();
		// CuentaAhorro cuentaAhorrosUpdate = new CuentaAhorro();
		LOGGER.info("Se procede a validar cuenta");

		try {
			Optional<CuentaCorriente> cuenta = repo.findById(cuentaAhorro.getNumeroCuenta());
			cuentaCorriente = cuenta.get();

			LOGGER.info(cuentaCorriente.toString());

			cuentaCorriente.setSaldo(cuentaCorriente.getSaldo() + cuentaAhorro.getValor());
			repo.save(cuentaCorriente);

			response.setCuenta(cuentaCorriente.getNumeroCuenta());
			response.setSaldo(cuentaCorriente.getSaldo());
			response.setTransaccionExito(1);
			response.setMensaje("Transaccion exitosa");
			return response;

		} catch (Exception e) {
			LOGGER.error(e);
			response.setTransaccionExito(0);
			response.setError(e.toString());
			response.setMensaje("Error en la transaccion");
			// response.setFecha(new Date);
			return response;

		}

	}

	public ResponseCuentaCorriente retirar(RequestCuentaCorriente cuentaAhorro) {
		ResponseCuentaCorriente response = new ResponseCuentaCorriente();
		CuentaCorriente cuentaCorriente = new CuentaCorriente();

		try {
			Optional<CuentaCorriente> cuenta = repo.findById(cuentaAhorro.getNumeroCuenta());
			cuentaCorriente = cuenta.get();

			LOGGER.info(cuentaCorriente.toString());

			if (cuentaCorriente.getSaldo() > cuentaAhorro.getValor()) {
				cuentaCorriente.setSaldo(cuentaCorriente.getSaldo() - cuentaAhorro.getValor());
				repo.save(cuentaCorriente);
				response.setCuenta(cuentaCorriente.getNumeroCuenta());
				response.setSaldo(cuentaCorriente.getSaldo());
				response.setTransaccionExito(1);
				response.setMensaje("Transaccion exitosa");
			}else {
				response.setCuenta(cuentaCorriente.getNumeroCuenta());
				response.setSaldo(cuentaCorriente.getSaldo());
				response.setMensaje("Transaccion fallida");
				response.setTransaccionExito(0);
				response.setMensaje("Saldo no disponible");
			}
			return response;

		} catch (Exception e) {
			LOGGER.error(e);
			response.setTransaccionExito(0);
			response.setError(e.toString());
			response.setMensaje("Error en la transaccion");
			// response.setFecha(new Date);
			return response;
		}
	}

}
