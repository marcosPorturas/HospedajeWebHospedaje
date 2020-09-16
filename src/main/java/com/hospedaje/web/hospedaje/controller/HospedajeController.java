package com.hospedaje.web.hospedaje.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospedaje.web.hospedaje.dto.request.HospedajeRequest;
import com.hospedaje.web.hospedaje.dto.response.HospedajeResponse;
import com.hospedaje.web.hospedaje.service.HospedajeService;

import reactor.core.publisher.Mono;

@RestController
@Validated
@RequestMapping("/hospedaje")
public class HospedajeController {
	
	@Autowired
	HospedajeService hospedajeService;
	
	
	@PostMapping("/agregar")
	public Mono<HospedajeResponse> agregarHospedaje(@RequestBody HospedajeRequest hospedajeRequest){
		return hospedajeService.agregarHospedaje(hospedajeRequest);
	}
	

}
