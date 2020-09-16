package com.hospedaje.web.hospedaje.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospedaje.web.hospedaje.client.feign.IngresoFeign;
import com.hospedaje.web.hospedaje.dto.response.IngresoResponse;


import reactor.core.publisher.Mono;

@Component
public class IngresoProxyImplement implements IngresoProxy{

	@Autowired
	IngresoFeign ingresoFeign;
	
	@Override
	public Mono<IngresoResponse> consultarIngreso(Integer idIngreso) {
		return Mono.just(ingresoFeign.consultarIngreso(idIngreso));
	}

	
	
}
