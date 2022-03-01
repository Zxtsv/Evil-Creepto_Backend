package org.generation.creeptomonedasdb.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Reacciones")

public class Reacciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	
	private Long id;//Llave primaria
	private Long type_id; // DUDA ENTRE INT O LONG ,tipo (comentario o pregunta)
	private Long ref_id; // id de comentario o id de la pregunta
	private Long user_id;//id de usuario
	private Date created_at ; //fecha de creacion
	//1.Constructor con fields
		//1.1 constructor vacio
		//2.getter y setter
		//3.toString
	
	public Reacciones(Long id, Long type_id, Long ref_id, Long user_id, Date created_at) {
		super();
		this.id = id;
		this.type_id = type_id;
		this.ref_id = ref_id;
		this.user_id = user_id;
		this.created_at = created_at;
	}// constructor
	
	
	public Reacciones() {
		// TODO Auto-generated constructor stub
	}//Constructor vacio


	public Long getId() {
		return id;
	}//getId


	public void setId(Long id) {
		this.id = id;
	}//setId


	public Long getType_id() {
		return type_id;
	}// getType_id


	public void setType_id(Long type_id) {
		this.type_id = type_id;
	}// setType_id


	public Long getRef_id() {
		return ref_id;
	}//getRef_id


	public void setRef_id(Long ref_id) {
		this.ref_id = ref_id;
	}//setRef_id


	public Long getUser_id() {
		return user_id;
	}//getUser_id


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}// setUser_id


	public Date getCreated_at() {
		return created_at;
	}// getCreated_at


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}//setCreated_at


	@Override
	public String toString() {
		return "Reacciones [id=" + id + ", type_id=" + type_id + ", ref_id=" + ref_id + ", user_id=" + user_id
				+ ", created_at=" + created_at + "]";
	}// toString
	

}//class Reacciones
