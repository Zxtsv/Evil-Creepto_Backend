package org.generation.creeptomonedasdb.service;

import java.util.List;
import java.util.Optional;

import org.generation.creeptomonedasdb.models.Reacciones;

// import org.generation.creeptomonedasdb.models.Reacciones;

//import org.generation.creeptomonedasdb.service.ReaccionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ReaccionesService {
	private final ReaccionesRepository reaccionesRepository;
	//private CrudRepository<Reacciones, Long> reaccionesRepository;
	
	@Autowired
	public ReaccionesService(ReaccionesRepository reaccionesRepository) {
		this.reaccionesRepository=reaccionesRepository;
	}//constructor ReaccionesService
	
	
	public List<Reacciones> getReacciones() {
	return reaccionesRepository.findAll();
		
	}//getReacciones

	public Reacciones getReacciones(Long reacId) {
		return reaccionesRepository.findById(reacId).
				orElseThrow(()-> new IllegalStateException("El producto"
		+ "con el id"+ reacId + "no existe"));
	}//getReacciones

	public void deleteReacciones(Long reacId) {
		if (reaccionesRepository.existsById(reacId)) {
			reaccionesRepository.deleteById(reacId);
		}//if exist
	}//deleteReacciones

	public void addReacciones(Reacciones reac) {
		Optional<Reacciones> reacByUser_id=      ///CHECARRRRR!!!!
		reaccionesRepository.findById(reac.getUser_id());
		if(reacByUser_id.isPresent()) {
			throw new IllegalStateException("El producto con el nombre" 
		+ "["+ reac.getUser_id()+"] ya existe.");
		}else {
			reaccionesRepository.save(reac);
		}//else //if	
	}//addReacciones

	

}//class ReaccionesService
