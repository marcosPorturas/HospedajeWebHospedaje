package com.hospedaje.web.hospedaje.dto.response;

import java.util.Date;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class HospedajeResponse {
	
	private Integer idHospedaje;
	private Integer idIngreso;
	private Integer idBungalow;
	private Date fechaIngreso;
	
	private double costoHospedaje;
	
	public Integer getIdHospedaje() {
		return idHospedaje;
	}
	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}
	public Integer getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(Integer idIngreso) {
		this.idIngreso = idIngreso;
	}
	public Integer getIdBungalow() {
		return idBungalow;
	}
	public void setIdBungalow(Integer idBungalow) {
		this.idBungalow = idBungalow;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getCostoHospedaje() {
		return costoHospedaje;
	}
	public void setCostoHospedaje(double costoHospedaje) {
		this.costoHospedaje = costoHospedaje;
	}

}
