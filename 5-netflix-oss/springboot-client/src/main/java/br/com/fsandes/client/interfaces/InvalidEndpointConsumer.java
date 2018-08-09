package br.com.fsandes.client.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "invalid")
public interface InvalidEndpointConsumer {

	@RequestMapping(value = "/api/musicas/invalid", method = RequestMethod.GET)
	public String getInvalid();

}
