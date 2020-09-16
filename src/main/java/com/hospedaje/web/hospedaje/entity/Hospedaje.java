package com.hospedaje.web.hospedaje.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.hospedaje.web.hospedaje.dto.response.BungalowResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Document(collection="hospedaje")
@Builder
@AllArgsConstructor
public class Hospedaje {
	
	@Id
	private Integer id;
	
	@Field(value="id_ingreso")
	private Integer idIngreso;
	
	@Field(value="bungalow")
	private BungalowResponse bungalow;
	
	@Field(value="creation_date")
	private Date creationDate;
	
	@Field(value="hospedaje_status")
	private HospedajeStatus hospedajeStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdIngreso() {
		return idIngreso;
	}

	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}

	public BungalowResponse getBungalow() {
		return bungalow;
	}

	public void setBungalow(BungalowResponse bungalow) {
		this.bungalow = bungalow;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public HospedajeStatus getHospedajeStatus() {
		return hospedajeStatus;
	}

	public void setHospedajeStatus(HospedajeStatus hospedajeStatus) {
		this.hospedajeStatus = hospedajeStatus;
	}
	

}
