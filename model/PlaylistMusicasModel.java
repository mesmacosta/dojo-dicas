package com.dojo.musicas.model;

import java.io.Serializable;

import com.dojo.musicas.entity.Musica;

public class PlaylistMusicasModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -766785243776108405L;

	private String playlistId;

	private String musicaId;

	private Musica musica;

	public String getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}

	public String getMusicaId() {
		return musicaId;
	}

	public void setMusicaId(String musicaId) {
		this.musicaId = musicaId;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}
}
