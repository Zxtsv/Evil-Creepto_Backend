package org.generation.creeptomonedasdb.service;

import java.util.Optional;

import org.generation.creeptomonedasdb.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
			if (usuarios.get().getContrasena().equals(contrasena)) {
				res = true;
			}
		}//if
		return res;
	}

}//clase UsuariosService
