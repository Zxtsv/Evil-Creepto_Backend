package org.generation.creeptomonedasdb.service;

import java.util.Optional;
import org.generation.creeptomonedasdb.models.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
    @Query("SELECT u FROM Publicacion u WHERE u.pregunta_titulo=?1")
    Optional<Publicacion> findByPublicacion (String publicacion);
}
