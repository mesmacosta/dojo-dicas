package com.dojo.springboot.jpa.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.springboot.jpa.entity.Artista;
import com.dojo.springboot.jpa.entity.Musica;

@RestController
@RequestMapping("/api/musicas")
public class MusicasController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Musica>> getByFilter(@RequestParam("filtro") String filtro) {
		return ResponseEntity.ok(mockMusicas());
	}

	private List<Musica> mockMusicas() {
		return Arrays.asList(Musica.builder().artista(Artista.builder().nome("artista").id("1").build()).nome("musica")
				.id("1").build());
	}

}
