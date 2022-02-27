package org.generation.creeptomonedasdb.controller;

import org.generation.creeptomonedasdb.models.Usuarios;
import org.generation.creeptomonedasdb.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/login/")
@CrossOrigin(origins="*")
public class LoginController {
	private final UsuariosService usuariosService;
	
	@Autowired
	public LoginController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}//constructor
	
	@PostMapping
	public String Login (@RequestBody Usuarios usuarios) {
		String res ="El email o la contraseña no coincide, inténtelo de nuevo";
		if(usuariosService.login(usuarios.getEmail(), usuarios.getPassword())) {
			res = "ok";
		}//if
		return res;
	}//login
	

}//class LoginController
