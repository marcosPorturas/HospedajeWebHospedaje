package com.hospedaje.web.hospedaje.client;

import com.hospedaje.web.hospedaje.dto.response.IngresoResponse;

import reactor.core.publisher.Mono;

public interface IngresoProxy {

	Mono<IngresoResponse> consultarIngreso(Integer idIngreso);
	
}
