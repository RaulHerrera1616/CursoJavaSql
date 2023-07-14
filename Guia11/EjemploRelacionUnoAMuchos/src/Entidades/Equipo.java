/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidades;

import java.util.List;


public class Equipo {
    private String nombreEquipo;
    private List<Jugador> listaDeJugadores;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, List<Jugador> listaDeJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.listaDeJugadores = listaDeJugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getListaDeJugadores() {
        return listaDeJugadores;
    }

    public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
        this.listaDeJugadores = listaDeJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + "\n listaDeJugadores=" + listaDeJugadores + '}';
    }
    
    
}
