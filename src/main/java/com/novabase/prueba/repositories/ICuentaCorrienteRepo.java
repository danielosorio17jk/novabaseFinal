package com.novabase.prueba.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novabase.prueba.model.CuentaCorriente;

//Notación para indicar que es un repositorio
//extends jpaRepository para obtener metodos principales de select, crear, update, delete
@Repository
public interface ICuentaCorrienteRepo extends JpaRepository<CuentaCorriente, Long>{
	
	Optional<CuentaCorriente> findById(Long numeroCuenta);
	
	//void save(CuentaAhorro cuentaAhorro);

}
