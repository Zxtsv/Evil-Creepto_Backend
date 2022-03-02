package org.generation.creeptomonedasdb.service;

import java.util.List;
import java.util.Optional;

import org.generation.creeptomonedasdb.models.Comentarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentariosService {
	
	private ComentariosRepository comentariosRepository;
	
	@Autowired
	public ComentariosService(ComentariosRepository comentariosRepository) {
		this.comentariosRepository = comentariosRepository;
	}
	
	public List<Comentarios> getComentarios(){
		return comentariosRepository.findAll();
	}//getComentarios

	public Comentarios getComentario(Long comId) {
		return comentariosRepository.findById(comId).orElseThrow(() -> new IllegalStateException("El comentario con el id " + comId + " no existe."));
	}//getComentario
	
	public void deleteComentario(Long comId) {
		if (comentariosRepository.existsById(comId)) {
			comentariosRepository.deleteById(comId);
		}//if exist
		
	}//deleteComentario
	
	public void addComentario(Comentarios com) {
		Optional<Comentarios> comByText = comentariosRepository.findByTexto(com.getTexto());
		if(comByText.isPresent()) {
			throw new IllegalStateException("El comentario con el texto [" + com.getTexto() + "] ya existe.");
		} else {
			comentariosRepository.save(com);
		}//else if
		
	}//addComentario
	
	//encuentra el usuario
	//valide si es free o prem
	//verificar que sea menor a 6 el total de sus comentarios
	//guarde el comentario
	
}
