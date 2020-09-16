package com.hospedaje.web.hospedaje.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospedaje.web.hospedaje.dto.response.BungalowResponse;

@FeignClient(name="bungalow", url="${url.bungalow.host}")
public interface BungalowFeign {

	
	@GetMapping("/{idBungalow}")
	BungalowResponse consultarBungalow(@PathVariable("idBungalow")Integer idBungalow);
	
}
