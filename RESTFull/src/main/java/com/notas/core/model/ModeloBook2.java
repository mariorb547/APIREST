package com.notas.core.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.notas.core.entity.Book;
import com.notas.core.entity.Book2;
import com.notas.core.entity.CodigoPostal;

public class ModeloBook2 {
	
	private int id;

	private long zip_code;
	
	private String locality;
	
	private String federal_entity;
	
	private String municipality;


public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getZip_code() {
		return zip_code;
	}
	public void setZip_code(long zip_code) {
		this.zip_code = zip_code;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getFederal_entity() {
		return federal_entity;
	}
	public void setFederal_entity(String federal_entity) {
		this.federal_entity = federal_entity;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

public ModeloBook2() {}

   
public ModeloBook2(Book2  book) {
	this.id = book.getId();
	this.zip_code = book.getZipCode();
	this.locality = book.getLocality();
	this.federal_entity = book.getFederalEntity();
	this.municipality = book.getMunicipality();
	
}

public ModeloBook2(int id, long zip_code, String locality, String federal_entity, String municipality) {
	super();
	this.id = id;
	this.zip_code = zip_code;
	this.locality = locality;
	this.federal_entity = federal_entity;
	this.municipality = municipality;
}
   
}
