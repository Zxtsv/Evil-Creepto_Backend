package org.generation.creeptomonedasdb.controller;

//import java.util.Date;
import java.util.List;

import org.generation.creeptomonedasdb.models.Reacciones;
import org.generation.creeptomonedasdb.service.ReaccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/reacciones/")
public class ReaccionesController {

	private final ReaccionesService reacService;
	@Autowired
	public ReaccionesController(ReaccionesService reacService) {
		this.reacService=reacService;
	}//constructor reacService
	
	@GetMapping
	public List<Reacciones> getReacciones(){
		return reacService.getReacciones();
	}// getReacciones
	
	@GetMapping(path="{reacId}")
	public Reacciones getReacciones(@PathVariable("reacId") Long reacId){
		return reacService.getReacciones(reacId);
	}// getReacciones
	
	@DeleteMapping(path="{reacId}")
	public void deleteReacciones(@PathVariable("reacdId") Long reacId) {
		reacService.deleteReacciones(reacId);
	}//deleteReacciones
	
	@PostMapping
	public void addReacciones(@RequestBody Reacciones reac) {
		reacService.addReacciones(reac);
	}//addReacciones
	
	
	
}// class ReaccionesController
