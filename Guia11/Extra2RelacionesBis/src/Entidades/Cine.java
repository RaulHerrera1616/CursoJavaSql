/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author iofefe
 */
public class Cine {
    /**
     * Nos piden hacer un programa sobre un Cine, que tiene una sala con un
     * conjunto de asientos (8 filas por 6 columnas). De Cine nos interesa
     * conocer la película que se está reproduciendo, la sala con los
     * espectadores y el precio de la entrada. Luego, de las películas nos
     * interesa saber el título, duración, edad mínima y director. Por último,
     * del espectador, nos interesa saber su nombre, edad y el dinero que tiene
     * disponible.
     */
    private Sala sala;
    private Pelicula pelicula;
    private float entrada;

    public Cine(Sala sala, Pelicula pelicula, float entrada) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.entrada = entrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }
    
    
}
