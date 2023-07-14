/*
Crear una clase Baraja con un array de objetos Carta que representará la baraja, y los siguientes métodos:

barajar(): que cambia aleatoriamente la posición de todas las cartas en la baraja.
siguienteCarta(): que devuelve la siguiente carta de la baraja y la elimina de la misma.
cartasDisponibles(): que indica el número de cartas que aún se pueden repartir.
darCartas(int n): que devuelve un array con las n cartas pedidas, o null si no hay suficientes cartas
en la baraja.
cartasMonton(): que muestra las cartas que ya han salido de la baraja.
mostrarBaraja(): que muestra todas las cartas de la baraja, excepto las que ya han salido.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList();
    private ArrayList<Carta> grupoCartas = new ArrayList();

    public void connstruirbaraja() {
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        for (String pa : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Carta car = new Carta(i, pa);
                    cartas.add(car);

                }
            }
        }
    }

    //barajar(): que cambia aleatoriamente la posición de todas las cartas en la baraja.
    public void barajar() {
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }

    //siguienteCarta(): que devuelve la siguiente carta de la baraja y la elimina de la misma.
    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay mas cartas en la baraja");
            return null;
        } else {
            Carta car = cartas.remove(0);
            System.out.println(car.getNumero()+ " "+car.getPalo());
            grupoCartas.add(car);
            return car;
        }
    }

    //cartasDisponibles(): que indica el número de cartas que aún se pueden repartir.
    public int cartasDisponibles() {
        return cartas.size();
    }

    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
    public void darCartas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cartas a pedir");
        int num = leer.nextInt();
        if (num>cartasDisponibles()) {
            System.out.println("El numero de cartas ingreasado es mayor al disponible");
        }
        for (int i = 0; i < num; i++) {
            siguienteCarta();
        }
         
        
    }
    //cartasMonton(): que muestra las cartas que ya han salido de la baraja.
    public void cartasMonton(){
        if (grupoCartas.isEmpty()) {
            System.out.println("No salió ninguna carta");
        }
        System.out.println(grupoCartas);        
    }
    //mostrarBaraja(): que muestra todas las cartas de la baraja, excepto las que ya han salido.
    public void mostrarBaraja(){
        System.out.println(cartas);
    }
}
