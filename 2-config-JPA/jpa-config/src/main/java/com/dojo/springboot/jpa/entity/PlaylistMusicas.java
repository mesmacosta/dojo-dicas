package com.dojo.springboot.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name="playlistmusicas")  
public class PlaylistMusicas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -500434344496785797L;

	@Id
	@Column(name = "playlistid")
	private String playlistId;

	@Id
	@Column(name = "musicaid")
	private String musicaId;

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
	
}
