package com.notas.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notas.core.entity.CodigoPostal;


@Repository("repositorioCodigo")
public interface CodigoPostalRepositorio extends JpaRepository<CodigoPostal, Serializable>{
	
	public abstract CodigoPostal findByZipcode(Long zipCode);
	
	public abstract CodigoPostal findByLocality(String locality);
	
	
	
}
