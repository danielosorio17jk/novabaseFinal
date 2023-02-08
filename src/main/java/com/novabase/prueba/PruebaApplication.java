package com.novabase.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.novabase.prueba.controller", "com.novabase.prueba.repositories",
"com.novabase.prueba.service"})//SE INSTANCIA TODOS NUESTROS OBJETOS 
@EntityScan("com.novabase.prueba.model")//se define para escaner diferentes entidades en distintos paquetes 
@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

}
