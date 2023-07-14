/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua r;
    Jugador ju = new Jugador();
    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    //• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    //y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {

        int numJug = ju.cargarJugadores();
        for (int i = 1; i < numJug + 1; i++) {
            ju.setId(i);
            ju.setNombre(ju.getNombre());
            ju.getMojado();
            jugadores.add(new Jugador(i, "Jugador", true));
        }
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore.toString());
        }
    }

    //• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
    //aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
    //moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
    //mojar. Al final del juego, se debe mostrar que jugador se mojó.
    //Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        boolean moj = false;
        for (Jugador jugadore : jugadores) {
            r.llenarRevolver();
            System.out.println(r.toString());
            System.out.println("Presione d para presionar el gatillo");
            String gatillo = leer.next();
            if (gatillo.equals("d")) {
                moj = jugadore.disparo(r);
            }

            System.out.println(moj);
            if (moj) {
                System.out.println(".........................................................");
                System.out.println(":¡¡¡¡¡¡¡¡PUM!!!!!!!!  El ...*..." + jugadore.getNombre() + "...*... se mojó:");
                System.out.println(".........................................................");
                break;
            }
            System.out.println("El " + jugadore.getNombre() + " se salvó");
        }
        if (!moj) {
            ronda(jugadores, r);
        }

    }
}
