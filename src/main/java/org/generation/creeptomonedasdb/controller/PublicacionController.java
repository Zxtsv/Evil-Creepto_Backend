package org.generation.creeptomonedasdb.controller;

import java.util.List;

import org.generation.creeptomonedasdb.models.Publicacion;
import org.generation.creeptomonedasdb.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping
    public List<Publicacion> getPublicaciones(){
        return publicacionService.getPublicaciones();
    }

    @GetMapping("/publicacion")
    public Publicacion getPublicacion(@RequestParam("pub") Long pubId){
        return publicacionService.getPublicacion(pubId);
    }

    @DeleteMapping(path = "{pubId}")
    public void deletePublicacion(@PathVariable("pubId") Long pubId){
        publicacionService.deletePublicacion(pubId);
    }

    @PostMapping
    public void addPublicacion(@RequestBody Publicacion pub){
        publicacionService.addPublicacion(pub);
    }
}
