package org.generation.creeptomonedasdb.service;

import java.util.List;

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

    public List<Publicacion> getPublicaciones(){
        return publicacionRepository.findAll();
    }

    public void deletePublicacion(Long pubId){
        if(publicacionRepository.existsById(pubId)){
            publicacionRepository.deleteById(pubId);
        }
    }

    public Publicacion getPublicacion(Long pubId){
        return publicacionRepository.findById(pubId).orElseThrow(()-> new IllegalStateException("La publicación con el id: "+pubId+" no ha sido encontrada"));
    }

    public void addPublicacion(Publicacion pub){
        publicacionRepository.save(pub);
    }


}
