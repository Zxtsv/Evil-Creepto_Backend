package org.generation.creeptomonedasdb.service;

import java.util.Optional;

import org.generation.creeptomonedasdb.models.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {
	
	@Query("SELECT c FROM Comentarios c WHERE c.texto=?1")
	Optional<Comentarios> findByTexto(String texto);
	
}
