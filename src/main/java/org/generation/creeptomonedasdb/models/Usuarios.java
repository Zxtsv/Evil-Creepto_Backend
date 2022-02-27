package org.generation.creeptomonedasdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id", unique = true, nullable = false)
	private Long id;
	private String email;
	private String password;
	
	
	
	public Usuarios(Long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}



	public Usuarios() {
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}//Class Usuarios
