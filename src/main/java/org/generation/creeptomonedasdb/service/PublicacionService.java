package org.generation.creeptomonedasdb.service;

import java.util.Optional;
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

    public boolean buscador(String titulo){
        boolean resultado = false;

        Optional<Publicacion> publicaciones = publicacionRepository.findByPublicacion(titulo);

        if(publicaciones.isPresent()){
            return resultado=true;
        }

        return resultado;
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

    /*
    public void updatePublicacion(Long pubId,String titulo,String cuerpo,Long categoryId){
        if(publicacionRepository.existsById(pubId)){
            Publicacion pub = publicacionRepository.getById(pubId);
            if(titulo!=null)pub.setPregunta_titulo(titulo);
            if(cuerpo!=null)pub.setPregunta_cuerpo(cuerpo);
            if(categoryId!=0)pub.setId_categoria(categoryId);
            publicacionRepository.save(pub);
        }
        else{
            System.out.println("No existe la publicación");
            System.err.println("No existe la publicación");
        }
    }
    */
}
