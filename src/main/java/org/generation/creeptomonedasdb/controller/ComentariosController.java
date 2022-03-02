package org.generation.creeptomonedasdb.controller;

import java.util.List;

import org.generation.creeptomonedasdb.models.Comentarios;
import org.generation.creeptomonedasdb.service.ComentariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/comentarios/")
@CrossOrigin("*")
public class ComentariosController {
	
	public final ComentariosService comService;
	
	@Autowired //sirve para instanciar el productoservice
	public ComentariosController(ComentariosService comService) {
		this.comService = comService;
	}//contructor
	
	@GetMapping
	public List<Comentarios> getComentarios(){
		return comService.getComentarios();
	}
	
	@GetMapping(path = "{comId}")
	public Comentarios getComentario(@PathVariable("comId") Long comId) {
		return comService.getComentario(comId);
	}
	
	@DeleteMapping(path = "{comId}")
	public void borrarComentario(@PathVariable("comId") Long comId) {
		comService.deleteComentario(comId);
	}//deleteComentario
	
	@PostMapping
	public void agregarComentario(@RequestBody Comentarios comentarios) {
		comService.addComentario(comentarios);
	}
	
	
}
