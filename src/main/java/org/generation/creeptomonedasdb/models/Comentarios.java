package org.generation.creeptomonedasdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comentarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique=true, nullable=false)
	private Long idtemp;
	private String usernametemp;
	private String profilePictemp;
	private String texto;
	
	//constructor
	public Comentarios(Long idtemp, String usernametemp, String profilePictemp, String texto) {
		super();
		this.idtemp = idtemp;
		this.usernametemp = usernametemp;
		this.profilePictemp = profilePictemp;
		this.texto = texto;
	}
	
	public Comentarios() {
		// TODO Auto-generated constructor stub
	}//constructor vacio

	//getters y setters
	public Long getIdtemp() {
		return idtemp;
	}

	public void setIdtemp(Long idtemp) {
		this.idtemp = idtemp;
	}

	public String getUsernametemp() {
		return usernametemp;
	}

	public void setUsernametemp(String usernametemp) {
		this.usernametemp = usernametemp;
	}

	public String getProfilePictemp() {
		return profilePictemp;
	}

	public void setProfilePictemp(String profilePictemp) {
		this.profilePictemp = profilePictemp;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	//tostring
	@Override
	public String toString() {
		return "Comentarios [idtemp=" + idtemp + ", usernametemp=" + usernametemp + ", profilePictemp=" + profilePictemp
				+ ", texto=" + texto + "]";
	}
	
}
