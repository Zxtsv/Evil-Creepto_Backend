package org.generation.creeptomonedasdb.models;

import java.util.Date;

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
	@Column(name ="id_usuario", unique = true, nullable = false)
	private Long id_usuario;
	private String nombre_usuario;
	private String email;
	private String contrasena;
	private String wallet;
	private String foto_perfil;
	private String descripcion;
	private String nombre;
	private String apellido;
	private String pais;
	private Date fecha_nacimiento;
	private Date final_suscripcion;
	

	
	public Usuarios(Long id_usuario, String nombre_usuario, String email, String contrasena, String wallet,
			String foto_perfil, String descripcion, String nombre, String apellido, String pais, Date fecha_nacimiento,
			Date final_suscripcion) {
		super();
		this.id_usuario = id_usuario;
		this.nombre_usuario = nombre_usuario;
		this.email = email;
		this.contrasena = contrasena;
		this.wallet = wallet;
		this.foto_perfil = foto_perfil;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.fecha_nacimiento = fecha_nacimiento;
		this.final_suscripcion = final_suscripcion;
	}







	public Usuarios() {
		// TODO Auto-generated constructor stub
	}







	public Long getId_usuario() {
		return id_usuario;
	}







	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}







	public String getNombre_usuario() {
		return nombre_usuario;
	}







	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}







	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public String getContrasena() {
		return contrasena;
	}







	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}







	public String getWallet() {
		return wallet;
	}







	public void setWallet(String wallet) {
		this.wallet = wallet;
	}







	public String getFoto_perfil() {
		return foto_perfil;
	}







	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}







	public String getDescripcion() {
		return descripcion;
	}







	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getApellido() {
		return apellido;
	}







	public void setApellido(String apellido) {
		this.apellido = apellido;
	}







	public String getPais() {
		return pais;
	}







	public void setPais(String pais) {
		this.pais = pais;
	}







	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}







	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}







	public Date getFinal_suscripcion() {
		return final_suscripcion;
	}







	public void setFinal_suscripcion(Date final_suscripcion) {
		this.final_suscripcion = final_suscripcion;
	}







	@Override
	public String toString() {
		return "Usuarios [id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", email=" + email
				+ ", contrasena=" + contrasena + ", wallet=" + wallet + ", foto_perfil=" + foto_perfil
				+ ", descripcion=" + descripcion + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", final_suscripcion=" + final_suscripcion + "]";
	}







	
}//class Usuarios





	
	
	



	