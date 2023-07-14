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
public class Pelicula {
    /**
     * de las películas nos interesa saber el título, duración, edad mínima y
     * director.
     */
    private String titulo;
    private int minuto;
    private int edadMinima;
    private String director;

    public Pelicula(String titulo, int minuto, int edadMinima, String director) {
        this.titulo = titulo;
        this.minuto = minuto;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
}
