package com.hospedaje.web.hospedaje.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HospedajeRequest {

	private Integer idHospedaje;
	private Integer idIngreso;
	private Integer idBungalow;
	
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
	
}
