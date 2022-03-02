package org.generation.creeptomonedasdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comentario")
public class Comentarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comentario", unique=true, nullable=false)
	private Long id_comentario;
	private String texto;
	private String texto_premium;
	
	//constructor
	public Comentarios(Long id_comentario, String texto, String texto_premium) {
		super();
		this.id_comentario = id_comentario;
		this.texto = texto;
		this.texto_premium = texto_premium;
	}
	
	public Comentarios() {
		// TODO Auto-generated constructor stub
	}//constructor vacio

	//getters y setters
	public Long getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(Long id_comentario) {
		this.id_comentario = id_comentario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTexto_premium() {
		return texto_premium;
	}

	public void setTexto_premium(String texto_premium) {
		this.texto_premium = texto_premium;
	}

	@Override
	public String toString() {
		return "Comentarios [id_comentario=" + id_comentario + ", texto=" + texto + ", texto_premium=" + texto_premium
				+ "]";
	}//toString
	
}
