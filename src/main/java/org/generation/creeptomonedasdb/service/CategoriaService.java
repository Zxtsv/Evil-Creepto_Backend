package org.generation.creeptomonedasdb.service;

import java.util.ArrayList;

import org.generation.creeptomonedasdb.models.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;
    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository){
        super();
        this.categoriaRepository = categoriaRepository;
    }

    public ArrayList<Publicacion> obtenerPorCategoria(Long categoria){
        return categoriaRepository.findByCategoria(categoria);
    }
}
