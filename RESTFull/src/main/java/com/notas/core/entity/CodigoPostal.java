package com.notas.core.entity;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import com.notas.core.entity.Settlement;


import javax.persistence.*;

@Table(name="CODIGOS_POSTALES")
@Entity
public class CodigoPostal implements Serializable{
	
	public CodigoPostal(){
		
	}
	
	public CodigoPostal(long zipcode, String locality, String federalEntity, String municipality) {
		this.zipcode = zipcode;
		this.locality = locality;
		this.federalEntity = federalEntity;
		this.municipality = municipality;
	}

	@Id
	@Column(name="ZIPCODE")
	private long zipcode;
	
	@Column(name="LOCALITY")
	private String locality;
	
	@Column(name="FEDERALENTITY")
	private String federalEntity;
	
	@Column(name="MUNICIPALITY")
	private String municipality;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="settlementId")
	private Settlement settlement;
	

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public String getFederalEntity() {
		return federalEntity;
	}

	public void setFederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getfederalEntity() {
		return federalEntity;
	}

	public void setfederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	
}

