package br.com.fsandes.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.fsandes.client.interfaces.DeezerEndpointConsumer;

@RestController
public class ClientRestController {

	@Autowired
	private DeezerEndpointConsumer deezerEndPoint;

	@GetMapping(value = "testeLoadBalance")
	@HystrixCommand(fallbackMethod = "getFallback")
	public String testeLoadBalance(@RequestParam(value = "error", required = false) String error) {
		return deezerEndPoint.getHardWork(error);
	}

	@GetMapping(value = "teste")
	@HystrixCommand(fallbackMethod = "getFallback")
	public String teste(@RequestParam(value = "error", required = false) String error) {
		return deezerEndPoint.getTest(error);
	}

	@GetMapping(value = "invalid")
	@HystrixCommand(fallbackMethod = "getFallback")
	public String testeInvalid() {
		return deezerEndPoint.getInvalid();
	}

	@GetMapping(value = "invalidConsumer")
	@HystrixCommand(fallbackMethod = "getFallback")
	public String testeInvalidConsumer() {
		return deezerEndPoint.getInvalid();
	}

	public String getFallback(String error) {
		return getFallbackString();
	}

	public String getFallback() {
		return getFallbackString();
	}

	private String getFallbackString() {
		return "[Erro] - Service sobrecarregado...";
	}

}
