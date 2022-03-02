package org.generation.creeptomonedasdb.service;

import java.util.Optional;

import org.generation.creeptomonedasdb.models.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicacionService {
    private final PublicacionRepository publicacionRepository;
    @Autowired
    public PublicacionService(PublicacionRepository publicacionRepository){
        super();
        this.publicacionRepository = publicacionRepository;
    }

    public boolean buscador(String titulo){
        boolean resultado = false;

        Optional<Publicacion> publicaciones = publicacionRepository.findByPublicacion(titulo);

        if(publicaciones.isPresent()){
            return resultado=true;
        }

        return resultado;
    }
}
