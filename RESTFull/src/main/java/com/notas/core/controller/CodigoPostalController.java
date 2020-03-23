package com.notas.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notas.core.model.ModeloCodigoPostal;
import com.notas.core.service.CodigoPostalService;


@RestController
@RequestMapping("/v1")
public class CodigoPostalController {
	
	@Autowired
	@Qualifier("servicioCodigo")
	CodigoPostalService serviceCodigo;
	
	
	@GetMapping("/codigo")
	public ModeloCodigoPostal obtenerNotas(@RequestParam(name = "zipcode") Long zipcode){
		
		return serviceCodigo.obtenerPorZipcode(zipcode);
	}
	
	@GetMapping("/localidad")
	public ModeloCodigoPostal obtenerLocalidad(@RequestParam(name = "locality") String locality){
		
		return serviceCodigo.obtenerPoLocalidad(locality);
	}
	
	@GetMapping("/codigos")
	public List<ModeloCodigoPostal> obtener(){
		
		return serviceCodigo.obtener();
	}
}
