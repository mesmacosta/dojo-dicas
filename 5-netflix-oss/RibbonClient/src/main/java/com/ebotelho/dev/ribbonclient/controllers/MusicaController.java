package com.ebotelho.dev.ribbonclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ebotelho.dev.config.ribbonclient.RibbonMusicaConfig;

@RestController
@RibbonClient(name = MusicaController.MUSIC_SERVICE, configuration = RibbonMusicaConfig.class)
public class MusicaController {

	static final String MUSIC_SERVICE = "deezer";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/musicas", method = RequestMethod.GET, produces = "application/json")
	public String getMusicas(@RequestParam("filtro") String filtro) {
		String response = restTemplate.getForEntity(gethost() + "/api/musicas/?filtro=" + filtro, String.class)
				.getBody();
		return response;
	}

	private String gethost() {
		return "http://" + MUSIC_SERVICE;
	}

	@RequestMapping(value = "/playlists", method = RequestMethod.GET, produces = "application/json")
	public String getPlaylistByUser(@RequestParam("user") String user) {
		return restTemplate.getForEntity(gethost() + "/api/playlists/?user=" + user, String.class).getBody();
	}

	@RequestMapping(value = "/playlists/{playlistId}/musicas", method = RequestMethod.PUT)
	public String addMusics(@PathVariable("playlistId") String playlistId) {
		return restTemplate.getForEntity(gethost() + "/api/playlists/" + playlistId + "/musicas", String.class)
				.getBody();
	}

	@RequestMapping(value = "/playlists/{playlistId}/musicas/{musicaId}", method = RequestMethod.DELETE)
	public String deleteMusic(@PathVariable("playlistId") String playlistId,
			@PathVariable("musicaId") String musicaId) {
		return restTemplate
				.getForEntity(gethost() + "/api/playlists/" + playlistId + "/musicas/" + musicaId, String.class)
				.getBody();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
