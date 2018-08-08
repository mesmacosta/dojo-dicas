package com.dojo.springboot.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name="Musicas")  
public class Musica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4436032799597928128L;

	@Id
	@Column(name = "Id")
	private String id;

	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "artistaid", insertable=false, updatable=false)
	private String artistaId;
	
	@ManyToOne
	@JoinColumn(name = "artistaid")
	private Artista artista;

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

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public String getArtistaId() {
		return artistaId;
	}

	public void setArtistaId(String artistaId) {
		this.artistaId = artistaId;
	}
}
