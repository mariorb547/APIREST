package com.notas.core.service;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.notas.core.entity.Settlement;
import com.notas.core.model.ModeloCodigoPostal;
import com.notas.core.repository.CodigoPostalRepositorio;


@Service("servicioCodigo")
public class CodigoPostalService {
	@Autowired
	@Qualifier("repositorioCodigo")
	private CodigoPostalRepositorio repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private com.notas.core.converter.Convertidor convertidor;
	
	
	
	
	
	public ModeloCodigoPostal obtenerPorZipcode(Long zipcode) {
		return new ModeloCodigoPostal(repositorio.findByZipcode(zipcode));
	}
	public ModeloCodigoPostal obtenerPoLocalidad(String locality) {
		return new ModeloCodigoPostal(repositorio.findByLocality(locality));
		
	}
	
	public List<ModeloCodigoPostal> obtener(){
	
	return convertidor.convertirListaCodigoPostal(repositorio.findAll());
	}

	
	
}
