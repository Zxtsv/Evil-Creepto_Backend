package org.generation.creeptomonedasdb.controller;
import java.util.ArrayList;

import org.generation.creeptomonedasdb.models.Publicacion;
import org.generation.creeptomonedasdb.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(path="/api/")
@CrossOrigin(origins = "*")
public class CategoriaController {
    private final CategoriaService categoriaService;
    @Autowired
    public CategoriaController(CategoriaService categoria){
        this.categoriaService = categoria;
    }

    @GetMapping("categoria")
    public ArrayList<Publicacion> getPublicacionesCategoria(@RequestParam("cat") Long categoria){
        return categoriaService.obtenerPorCategoria(categoria);
    }
}
