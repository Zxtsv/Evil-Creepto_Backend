package org.generation.creeptomonedasdb.service;

import java.util.Optional;

import org.generation.creeptomonedasdb.models.Reacciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReaccionesRepository extends JpaRepository<Reacciones, Long>{
	@Query("SELECT p FROM Reacciones r WHERE p.nombre=?1")
	Optional<Reacciones> findByNombre (String nombre);

	static boolean exitsById1(Long reacId) {
		
		return false;
	}

	static boolean exitsById(Long reacId) {
		
		return false;
	}

	
	//creado desde reacciones Service
	Optional<Reacciones> findByuser_id(Long user_id);

}//class interface
