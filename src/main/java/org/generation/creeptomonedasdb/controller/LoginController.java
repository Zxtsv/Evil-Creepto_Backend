package org.generation.creeptomonedasdb.controller;


import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.generation.creeptomonedasdb.jwt.config.JwtFilter;
import org.generation.creeptomonedasdb.models.Token;
import org.generation.creeptomonedasdb.models.Usuarios;
import org.generation.creeptomonedasdb.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

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
//		public Token Login(@RequestBody Usuarios usuarios) throws ServletException {
		public String Login(@RequestBody Usuarios usuarios) {
		String res = "Nombre de usuario o contrase�a incorrectos";
		if(usuariosService.login(usuarios.getEmail(), usuarios.getContrasena())) {
//			return new Token(generateToken(usuarios.getEmail()));
			res ="Accesso permitido";
		}//if
//		throw new ServletException("Nombre de usuario o contrase�a incorrectos");
		return res;
	}//login
	
	private String generateToken(String email) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, 10);
		return Jwts.builder().setSubject(email).claim("role", "email")
				.setIssuedAt(new Date()).setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret).compact();
	}// generateToken
	

}//class LoginController
