package br.com.fsandes.client.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "deezer")
public interface DeezerEndpointConsumer {
	
	@RequestMapping(value = "/api/musicas/hardwork" , method = RequestMethod.GET)
	public String getHardWork(@RequestParam(value = "error", required = false) String error);
	
	@RequestMapping(value = "/api/musicas/teste" , method = RequestMethod.GET)
	public String getTest(@RequestParam(value = "error", required = false) String error);

	@RequestMapping(value = "/api/musicas/invalid" , method = RequestMethod.GET)
	public String getInvalid();
	
}
