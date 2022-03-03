package org.generation.creeptomonedasdb.controller;

import java.util.List;

import org.generation.creeptomonedasdb.models.Usuarios;
import org.generation.creeptomonedasdb.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/usuarios/")
@CrossOrigin(origins = "*")
public class UsuariosController {
	public final UsuariosService usuariosService;
	
	@Autowired
	public UsuariosController (UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	@GetMapping
	public List<Usuarios> getUsuarios(){
		return usuariosService.getUsuarios();
	}//getUsuarios
	
	@GetMapping(path ="{idUsuario}")
	public Usuarios getUsuario (@PathVariable("idUsuario") Long idUsuario) {
		return usuariosService.getUsuario(idUsuario);
	}//getUsuario
	
	@DeleteMapping(path= "{idUsuario}")
	public void borrarUsuario (@PathVariable("idUsuario")Long idUsuario) {
		usuariosService.borrarUsuario(idUsuario);
	}//borrarUsuario
	
	@PutMapping(path = "{idUsuario}")
	public void actualizarUsuario(@PathVariable("idUsuario") Long idUsuario, 
			@RequestParam String contrasenaActual, 
			@RequestParam String contrasenaNueva) {
		usuariosService.actualizarUsuario(idUsuario, contrasenaActual, contrasenaNueva);
	}//actualizarUsuario
	
	@PostMapping
    public void addUsuario(@RequestBody Usuarios usuarios) {
        usuariosService.addUsuario(usuarios);
    }//agregarUsuario
	
}// class UsuariosConroller
