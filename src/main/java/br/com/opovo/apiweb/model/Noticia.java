package br.com.opovo.apiweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	

@Entity
@Table(name = "tb_noticia")
public class Noticia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String titulo;
	private String autor;
	private String corpoNoticia;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//@Column(length = 255, nullable=false)
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCorpoNoticia() {
		return corpoNoticia;
	}
	public void setCorpoNoticia(String corpoNoticia) {
		this.corpoNoticia = corpoNoticia;
	}

}
