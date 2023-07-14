/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2relacionesApp;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;

public class Ejercicio2Relaciones {

    public static void main(String[] args) {

        RevolverDeAgua r = new RevolverDeAgua();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Juego jue = new Juego();
        jue.llenarJuego(jugadores, r);
        jue.ronda(jugadores, r);
    }

}
