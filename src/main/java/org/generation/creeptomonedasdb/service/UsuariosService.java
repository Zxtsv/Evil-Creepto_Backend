package org.generation.creeptomonedasdb.service;

import java.util.List;
import java.util.Optional;

import org.generation.creeptomonedasdb.models.Usuarios;
import org.generation.creeptomonedasdb.utils.SHAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UsuariosService {
	private final UsuariosRepository usuariosRepository;
	
	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		super();
		this.usuariosRepository = usuariosRepository;
	}//constructor
	
	public boolean login (String email, String contrasena) {
		boolean res = false;
		Optional<Usuarios>usuarios = usuariosRepository.findByEmail(email);
		if(usuarios.isPresent()) {
			System.out.println("Password SHA:" + SHAUtil.createHash(contrasena));
			if (usuarios.get().getContrasena().equals(contrasena)) {
				res = true;
			}
		}//if
		return res;
	}//login
	
	public List<Usuarios> getUsuarios(){
		return usuariosRepository.findAll();
	}//getUsuarios
	
	public void borrarUsuario(Long idUsuario) {
		if(usuariosRepository.existsById(idUsuario)) {
			usuariosRepository.deleteById(idUsuario);
		}else {
            throw new IllegalStateException("El usuario con el id " + idUsuario + " no existe");
		}
	}//deleteUsuario
	
	
	public void addUsuario (Usuarios usuarios) {
		Optional<Usuarios> usuarioByEmail = usuariosRepository.findByEmail(usuarios.getEmail());
		if (usuarioByEmail.isPresent()) {
			throw new IllegalStateException("El usuario con el correo: " + usuarios.getEmail() + "ya existe.");
		}//if
		usuariosRepository.save(usuarios);
	}//addUsuario
	
	public void actualizarUsuario(Long idUsuario, String contrasenaActual, String contrasenaNueva) {
		if(usuariosRepository.existsById(idUsuario)) {
			Usuarios usuarios = usuariosRepository.getById(idUsuario);
			if ((contrasenaNueva != null) && (contrasenaActual != null)) {
				if ((usuarios.getContrasena().equals(contrasenaActual))&&
						(! usuarios.getContrasena().equals(contrasenaNueva))) {
					usuarios.setContrasena(contrasenaNueva);
					usuariosRepository.save(usuarios);
				}else {
					throw new IllegalStateException("Contraseña incorrecta"); 
				}//esle //if equals
			}else {
				throw new IllegalStateException("Contraseñas nulas");
			}//else //!=null
		}else {
			throw new IllegalStateException("Usuario no encontrado " + idUsuario);
		}//else //if existById
	}//updateUsuario
	
	public Usuarios getUsuario(Long idUsuario) {
		return usuariosRepository.findById(idUsuario).orElseThrow(
				()-> new IllegalStateException("El usuario con el id " + idUsuario + " no existe"));
				
	}
	
}//clase UsuariosService
