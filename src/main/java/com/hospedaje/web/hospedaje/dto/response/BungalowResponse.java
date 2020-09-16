package com.hospedaje.web.hospedaje.dto.response;

import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
public class BungalowResponse {

	private Integer id;
	private String categoria;
	private Double precioDia;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
}
