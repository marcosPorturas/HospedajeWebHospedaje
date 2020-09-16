package com.hospedaje.web.hospedaje.dto.response;

import java.util.Date;

import lombok.experimental.SuperBuilder;


@SuperBuilder
public class HospedajeDetailsResponse extends HospedajeResponse{
	
	private Date fechaSalida;
	private String horaSalida;
	private Integer dias;
	
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Integer getDias() {
		return dias;
	}
	public void setDias(Integer dias) {
		this.dias = dias;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

}
