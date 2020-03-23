package com.notas.core.entity;

import javax.persistence.*;
 

@Table(name="SETTLEMENTS2")
@Entity
public class Story2 {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
 
	
	@Column(name="name")
	private String name;
	
	@Column(name="zone_type")
	private String zoneType;
	
	@Column(name="settlement_type")
	private String settlementType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZoneType() {
		return zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}
	
 
}