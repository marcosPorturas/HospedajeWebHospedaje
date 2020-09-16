package com.hospedaje.web.hospedaje.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospedaje.web.hospedaje.client.feign.BungalowFeign;
import com.hospedaje.web.hospedaje.dto.response.BungalowResponse;

import reactor.core.publisher.Mono;

@Component
public class BungalowProxyImplement implements BungalowProxy{

	@Autowired
	BungalowFeign bungalowFeign;
	
	@Override
	public Mono<BungalowResponse> consultarBungalow(Integer idBungalow) {
		// TODO Auto-generated method stub
		return Mono.just(bungalowFeign.consultarBungalow(idBungalow));
	}

	
	
}
