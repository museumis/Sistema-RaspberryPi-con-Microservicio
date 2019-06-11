package com;

/**
 * @author Ismael MR
 * @since 2019-06-11
 * 
 * Microservicio java para acceder a una base de datos MariaDb y responder peticiones Rest
 * 
 * <a href="mailto:ismaelmrdev@gmail.com">Correo electronico</a> * 
 * <a>https://museumis.github.io/Si/</a>
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);	
	}
}
