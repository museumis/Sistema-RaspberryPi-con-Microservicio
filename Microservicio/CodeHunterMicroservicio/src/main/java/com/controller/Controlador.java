package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hunter;
import com.service.Servicio;

@RestController
public class Controlador {

	@Autowired
	private Servicio servicio;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@CrossOrigin(origins = "*", maxAge = 3600)
	public ResponseEntity<List<Hunter>> getAllUsuarios() {
		return servicio.getAllUsuario();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@CrossOrigin(origins = "*", maxAge = 3600)
	public @ResponseBody String addNewUser(@RequestParam String id) {
		return "vacio";
	}

}
