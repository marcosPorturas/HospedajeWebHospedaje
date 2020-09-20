package com.hospedaje.web.hospedaje.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
@AllArgsConstructor
public class BungalowResponse {

	private Integer idBungalow;
	private String categoria;
	private Double precioDia;
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPrecioDia() {
		return precioDia;
	}
	public void setPrecioDia(Double precioDia) {
		this.precioDia = precioDia;
	}
	public Integer getIdBungalow() {
		return idBungalow;
	}
	public void setIdBungalow(Integer idBungalow) {
		this.idBungalow = idBungalow;
	}
}
