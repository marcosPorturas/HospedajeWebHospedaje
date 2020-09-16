package com.hospedaje.web.hospedaje.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospedaje.web.hospedaje.dto.response.IngresoResponse;

@FeignClient(name="ingreso", url="${url.ingreso.host}")
public interface IngresoFeign {

	
	@GetMapping("/{idIngreso}")
	IngresoResponse consultarIngreso(@PathVariable("idIngreso")Integer idIngreso);
}
