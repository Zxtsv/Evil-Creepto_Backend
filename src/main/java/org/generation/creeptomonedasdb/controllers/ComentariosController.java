package org.generation.creeptomonedasdb.controllers;

import org.generation.creeptomonedasdb.models.Comentarios;
import org.generation.creeptomonedasdb.services.ComentariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/comentarios/")
public class ComentariosController {
	public final ComentariosService comService;
	
	@Autowired //sirve para instanciar el productoservice
	public ComentariosController(ComentariosService prodService) {
		this.comService = prodService;
	}//contructor
	
	@PostMapping
	public void addComentario(@RequestBody Comentarios com) {
		comService.addComentario(com);
	}//falta agregar metodo
	
}
