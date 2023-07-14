/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
 */
package PeliculaApp;

import Servicio.PeliculaService;


public class Ej4App {


    public static void main(String[] args) {
        PeliculaService ser = new PeliculaService();
        ser.crearPeliculas();
        ser.mostrarPeliculas();
        System.out.println("*-------Peliculas con duracion mayor a una hora-------*");
        ser.mayorUnaHora();
        System.out.println("*-------Peliculas de mayor a menor por duracion-------*");
        ser.mayorAMenor();
        System.out.println("*-------Peliculas de menor a mayor por duracion-------*");
        ser.menorAMayor();
        System.out.println("*------Peliculas alfabeticamente por titulo------*");
        ser.alfabeticamenteTitulo();
        System.out.println("*------Peliculas alfabeticamente por director------*");
        ser.alfabeticamenteDirector();
    }
    
}
