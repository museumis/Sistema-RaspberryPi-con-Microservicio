package com.service;

/**
 * @author Ismael MR
 * @since 2019-06-11
 * 
 * <a href="mailto:ismaelmrdev@gmail.com">Correo electronico</a> * 
 * <a>https://museumis.github.io/Si/</a>
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.model.Hunter;
import com.repository.ManejadorBD;
/**
 * 
 * @author Ismael Martin
 *
 */
@Service
public class Servicio {

	@Autowired
	private ManejadorBD baseDatos;
	
	public ResponseEntity<List<Hunter>> getAllUsuario() {
		
		List<Hunter> contenido = baseDatos.getAll();
		ResponseEntity<List<Hunter>> respuesta;
		
		if(!contenido.isEmpty()) {
			respuesta = new ResponseEntity<>(contenido,HttpStatus.OK);
		}else {
			respuesta = new ResponseEntity<>(contenido,HttpStatus.NO_CONTENT);
		}
		
		return respuesta;
}

	public void inserHunter(Hunter nuevoHunter) {

	}
	
}
