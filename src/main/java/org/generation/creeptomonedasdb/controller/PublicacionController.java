package org.generation.creeptomonedasdb.controller;

import org.generation.creeptomonedasdb.models.Publicacion;
import org.generation.creeptomonedasdb.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path="/api/publicacion/")
@CrossOrigin(origins = "*")
public class PublicacionController {
    private final PublicacionService publicacionService;

    @Autowired
    public PublicacionController(PublicacionService publicacionService){
        this.publicacionService = publicacionService;
    }

    @PostMapping
    public String Buscador(@RequestBody Publicacion publicacion){
        String resultado = "La publicación no existe";
        if(publicacionService.buscador(publicacion.getPregunta_titulo())){
            resultado = "Publicación encontrado";
        }
        return resultado;
    }
    
}
