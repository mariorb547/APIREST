package com.notas.core.model;

import com.notas.core.entity.CodigoPostal;

public class ModeloCodigoPostal {
	public ModeloCodigoPostal() {
		
	}
	
	public ModeloCodigoPostal(CodigoPostal CodigoPostal) {
		this.zipcode = CodigoPostal.getZipcode();
		this.locality = CodigoPostal.getLocality();
		this.municipaly = CodigoPostal.getMunicipality();
		this.federalEntity = CodigoPostal.getfederalEntity();
	}
	
	


	public ModeloCodigoPostal(Long zipcode, String locality, String municipaly, String federalEntity) {
		this.zipcode = zipcode;
		this.locality = locality;
		this.municipaly = municipaly;
		this.federalEntity = federalEntity;
	}
	
	private Long zipcode;
	
	private String locality;
	
	private String municipaly;
	
	private String federalEntity;

	public long getzipcode() {
		return zipcode;
	}

	public void setzipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getMunicipaly() {
		return municipaly;
	}

	public void setMunicipaly(String municipaly) {
		this.municipaly = municipaly;
	}

	public String getfederalEntity() {
		return federalEntity;
	}

	public void setfederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}

}
