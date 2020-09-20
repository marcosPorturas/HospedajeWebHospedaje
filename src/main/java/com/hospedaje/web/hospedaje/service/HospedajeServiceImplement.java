package com.hospedaje.web.hospedaje.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospedaje.web.hospedaje.client.BungalowProxy;
import com.hospedaje.web.hospedaje.client.IngresoProxy;
import com.hospedaje.web.hospedaje.dto.request.HospedajeRequest;
import com.hospedaje.web.hospedaje.dto.response.BungalowResponse;
import com.hospedaje.web.hospedaje.dto.response.HospedajeResponse;
import com.hospedaje.web.hospedaje.dto.response.IngresoResponse;
import com.hospedaje.web.hospedaje.entity.Hospedaje;
import com.hospedaje.web.hospedaje.entity.HospedajeStatus;
import com.hospedaje.web.hospedaje.repository.HospedajeRepository;
import com.hospedaje.web.hospedaje.repository.HospedajeStatusRepository;

import reactor.core.publisher.Mono;

@Service
public class HospedajeServiceImplement implements HospedajeService{
	
	@Autowired
	IngresoProxy ingresoProxy;
	
	@Autowired
	BungalowProxy bungalowProxy;
	
	@Autowired
	HospedajeRepository hospedajeRepository;
	
	@Autowired
	HospedajeStatusRepository hospedajeStatusRepository;

	@Override
	public Mono<HospedajeResponse> agregarHospedaje(HospedajeRequest hospedajeRequest) {
		
		Mono<Integer> idHospedaje = Mono.just(hospedajeRequest.getIdHospedaje());
		
		Mono<HospedajeStatus> singleHospedajeStatus = hospedajeStatusRepository.findById(0);
		
		Mono<IngresoResponse> singleIngreso = ingresoProxy.consultarIngreso(hospedajeRequest.getIdIngreso());
		
		Mono<BungalowResponse> singleBungalow = bungalowProxy.consultarBungalow(hospedajeRequest.getIdBungalow());
	
		
		return Mono.zip(idHospedaje,singleHospedajeStatus,singleIngreso,singleBungalow)
				.map(tupla->converToHospedajeEntity(tupla.getT1(),tupla.getT2(),tupla.getT3(),tupla.getT4()))
				.flatMap(hospedajeRepository::save)
				.map(this::convertToHospedajeResponse);
	}

	
	public Hospedaje converToHospedajeEntity(Integer idHospedaje,HospedajeStatus hospedajeStatus,
			IngresoResponse ingreso,BungalowResponse bungalow) {
		
		return Hospedaje.builder()
				.id(idHospedaje)
				.idIngreso(ingreso.getIdIngreso())
				.bungalow(bungalow)
				.creationDate(new Date())
				.hospedajeStatus(hospedajeStatus)
				.build();
	}
	
	public HospedajeResponse convertToHospedajeResponse(Hospedaje hospedaje) {
		return HospedajeResponse.builder()
				.idHospedaje(hospedaje.getId())
				.idIngreso(hospedaje.getIdIngreso())
				.idBungalow(hospedaje.getBungalow().getIdBungalow())
				.fechaIngreso(hospedaje.getCreationDate())
				.build();
	}
}
