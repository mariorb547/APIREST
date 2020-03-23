package com.notas.core.entity;
import javax.persistence.*;

@Table(name="CODIGOS_POSTALES2")
@Entity
public class Book2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name="zip_code")
	private long zipCode;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="federal_entity")
	private String federalEntity;
	
	@Column(name="municipality")
	private String municipality;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="settlementId")
	private Settlement settlement;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getZipCode() {
		return zipCode;
	}


	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public String getFederalEntity() {
		return federalEntity;
	}


	public void setFederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}


	public String getMunicipality() {
		return municipality;
	}


	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}


	public Settlement getSettlement() {
		return settlement;
	}


	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}


	
	
	
	
 
	
 
}