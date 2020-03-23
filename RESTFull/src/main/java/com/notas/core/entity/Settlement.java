package com.notas.core.entity;

import javax.persistence.*;

@Table(name="SETTLEMENTS")
@Entity
public class Settlement {

	@GeneratedValue
	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ZONETYPE")
	private String zone_type;
	
	@Column(name="SETTLEMENTTYPE")
	private String settlement_type;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZone_type() {
		return zone_type;
	}

	public void setZone_type(String zone_type) {
		this.zone_type = zone_type;
	}

	public String getSettlement_type() {
		return settlement_type;
	}

	public void setSettlement_type(String settlement_type) {
		this.settlement_type = settlement_type;
	}


	

	
}
