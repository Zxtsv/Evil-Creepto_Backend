package org.generation.creeptomonedasdb.models;

import javax.persistence.*;

@Entity
@Table(name="pregunta")
public class Publicacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pregunta",unique = true, nullable = false)
    private Long id_pregunta;
    private Long id_categoria;
    private String pregunta_titulo;
    private String pregunta_cuerpo;
    private String fecha_publicacion;
    public Publicacion(Long id_pregunta, Long id_categoria, String pregunta_titulo, String pregunta_cuerpo,String fecha_publicacion) {
        super();
        this.id_pregunta = id_pregunta;
        this.id_categoria = id_categoria;
        this.pregunta_titulo = pregunta_titulo;
        this.pregunta_cuerpo = pregunta_cuerpo;
        this.fecha_publicacion = fecha_publicacion;
    }

    public Publicacion(){
        
    }
    public Long getId_pregunta() {
        return id_pregunta;
    }
    public void setId_pregunta(Long id_pregunta) {
        this.id_pregunta = id_pregunta;
    }
    public Long getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getPregunta_titulo() {
        return pregunta_titulo;
    }
    public void setPregunta_titulo(String pregunta_titulo) {
        this.pregunta_titulo = pregunta_titulo;
    }
    public String getPregunta_cuerpo() {
        return pregunta_cuerpo;
    }
    public void setPregunta_cuerpo(String pregunta_cuerpo) {
        this.pregunta_cuerpo = pregunta_cuerpo;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    @Override
    public String toString() {
        return "Publicacion [fecha_publicacion=" + fecha_publicacion + ", id_categoria=" + id_categoria
                + ", id_pregunta=" + id_pregunta + ", pregunta_cuerpo=" + pregunta_cuerpo + ", pregunta_titulo="
                + pregunta_titulo + "]";
    }
    
}
