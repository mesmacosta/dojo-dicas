package com.dojo.springboot.jpa.controllers;

import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.springboot.jpa.entity.Artista;
import com.dojo.springboot.jpa.entity.Musica;
import com.dojo.springboot.jpa.entity.Playlist;
import com.dojo.springboot.jpa.entity.Usuario;

@RestController
@CrossOrigin
@RequestMapping("/api/playlists")
public class PlaylistController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Playlist> getByUser(@RequestParam("user") String user) {
		return ResponseEntity.ok(mockPlaylist(user));
	}

	private Playlist mockPlaylist(String user) {
		return Playlist.builder().id("1")
				.musicas(Arrays.asList(Musica.builder().artista(Artista.builder().id("1").nome("artista").build())
						.artistaId("1").id("1").nome("musica").build()))
				.usuario(Usuario.builder().id("1").nome(user).build()).build();
	}
}
