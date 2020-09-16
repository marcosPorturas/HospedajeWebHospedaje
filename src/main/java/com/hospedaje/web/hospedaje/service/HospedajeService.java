package com.hospedaje.web.hospedaje.service;

import com.hospedaje.web.hospedaje.dto.request.HospedajeRequest;
import com.hospedaje.web.hospedaje.dto.response.HospedajeResponse;

import reactor.core.publisher.Mono;

public interface HospedajeService {

	Mono<HospedajeResponse> agregarHospedaje(HospedajeRequest hospedajeRequest);
	
}
