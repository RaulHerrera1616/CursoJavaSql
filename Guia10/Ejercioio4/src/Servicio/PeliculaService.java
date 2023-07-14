/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {

    ArrayList<Pelicula> peliculas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula() {
        String titulo;
        String director;
        int duracion;
        String opcion = "s";
        do {
            System.out.println("Ingrese el titulo de la película");
            titulo = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula en horas");
            duracion = leer.nextInt();
            leer.next(); // Consumir el carácter de nueva línea
            peliculas.add(new Pelicula(titulo, director, duracion));
//            Pelicula peli = new Pelicula(titulo, director, duracion);
//            peliculas.add(peli);
            System.out.println("Desea ingresar otra pelicula");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s"));

    }

    //• Mostrar en pantalla todas las películas.
    public void mostrarPeliculasEnPantalla() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
        }
    }

    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarMayorUnaHora() {
        System.out.println("*-----Peliculas con duracion mayor a una hora: -----*");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                mostrarPeliculasEnPantalla();
            }
        }
    }

    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void ordenMayorAMenor() {
        System.out.println("*-----Películas ordenadas de mayor a menor duración:-----*");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p2.getDuracion().compareTo(p1.getDuracion());
            }
        });
        mostrarPeliculasEnPantalla();

    }

    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    //pantalla.
    public void ordenMenorAMayor() {
        System.out.println("*-----Películas ordenadas de menor a mayor duración:-----*");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t1, Pelicula t) {
                return t1.getDuracion().compareTo(t.getDuracion());
            }
        });
        mostrarPeliculasEnPantalla();

    }

    //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void tituloAlfabeticamente() {
        System.out.println("*-----Películas ordenadas alfabéticamente por titulo:-----*");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getTitulo().compareTo(t1.getTitulo());
            }
        });
        mostrarPeliculasEnPantalla();
    }

    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void directorAlfabeticamente() {
        System.out.println("*-----Películas ordenadas alfabéticamente por director:-----*");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getDirector().compareTo(t1.getDirector());
            }
        });
        mostrarPeliculasEnPantalla();
    }
}
