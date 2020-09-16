package com.hospedaje.web.hospedaje.client;

import com.hospedaje.web.hospedaje.dto.response.BungalowResponse;

import reactor.core.publisher.Mono;

public interface BungalowProxy {

	Mono<BungalowResponse> consultarBungalow(Integer idBungalow);
	
}
