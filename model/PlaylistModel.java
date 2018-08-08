package com.dojo.musicas.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Playlist")
public class PlaylistModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2323675328067732920L;

	private String id;

	private List<PlaylistMusicasModel> playlistMusicas;

	private UsuarioModel usuario;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<PlaylistMusicasModel> getPlaylistMusicas() {
		return playlistMusicas;
	}

	public void setPlaylistMusicas(List<PlaylistMusicasModel> playlistMusicas) {
		this.playlistMusicas = playlistMusicas;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

}
