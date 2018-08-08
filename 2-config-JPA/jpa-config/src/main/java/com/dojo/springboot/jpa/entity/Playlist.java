package com.dojo.springboot.jpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name="Playlists")  
public class Playlist implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7280733629265134658L;
	@Id
	@Column(name = "Id")
	private String id;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "PlaylistMusicas", joinColumns = { 
			@JoinColumn(name = "playlistid", nullable = false, updatable = false, referencedColumnName="id") }, 
			inverseJoinColumns = { @JoinColumn(name = "musicaid", 
					nullable = false, updatable = false) })
	private List<Musica> musicas;

	@OneToOne(mappedBy = "playlist")
	private Usuario usuario;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
