package com.novabase.prueba.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novabase.prueba.model.CuentaAhorro;

//Notación para indicar que es un repositorio
//extends jpaRepository para obtener metodos principales de select, crear, update, delete
@Repository
public interface ICuentaAhorroRepo extends JpaRepository<CuentaAhorro, Long>{



}
