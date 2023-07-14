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
import java.util.List;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula> peliculas = new ArrayList();

    public void crearPeliculas() {
        String opc = "s";
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            String director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula");
            int duracion = leer.nextInt();
            Pelicula pelicula1 = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula1);
            
            System.out.println("Desea agregra otra pelicula s/n");
            opc=leer.next();
        } while (opc.equalsIgnoreCase("s"));

       
    }
    public void mostrarPeliculas(){
        
        for (Pelicula pelicula : peliculas) {
//            System.out.println(pelicula.getTitulo()+ " - " +pelicula.getDirector()+ " - "+pelicula.getDuracion());
                System.out.println(pelicula.toString());
        }
    }
    public void mayorUnaHora(){
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion()>1) {
                System.out.println(pelicula.toString());
            }
        }
    }
    public void mayorAMenor(){
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t1.getDuracion().compareTo(t.getDuracion());
            }
        });
        mostrarPeliculas();
    }
    public void menorAMayor(){
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getDuracion().compareTo(t1.getDuracion());
            }
        });
        mostrarPeliculas();
    }
    public void alfabeticamenteTitulo(){
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getTitulo().compareTo(t1.getTitulo());
            }
        });
        mostrarPeliculas();
    }
    public void alfabeticamenteDirector(){
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getDirector().compareTo(t1.getDirector());
            }
        });
        mostrarPeliculas();
        
    }
}
