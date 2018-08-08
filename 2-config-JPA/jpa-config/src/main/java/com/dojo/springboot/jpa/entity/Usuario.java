package com.dojo.springboot.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name="Usuarios")  
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3881307302439210321L;

	@Id
	@Column(name = "Id")
	private String id;

	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "playlistid")
	private String playlistId;
	
	@OneToOne
	@JoinColumn(name= "playlistid", insertable = false, updatable = false)
	private Playlist playlist;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
