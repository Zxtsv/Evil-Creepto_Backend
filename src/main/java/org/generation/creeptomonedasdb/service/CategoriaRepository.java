package org.generation.creeptomonedasdb.service;

import java.util.ArrayList;

import org.generation.creeptomonedasdb.models.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepository extends JpaRepository<Publicacion, Long>{
    @Query("SELECT u FROM Publicacion u WHERE u.id_categoria=?1")
    public abstract ArrayList<Publicacion> findByCategoria(Long categoria);
}
