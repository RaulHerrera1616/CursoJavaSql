/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3relacionesApp;

import Entidades.Baraja;
import java.util.Scanner;


public class Ejercicio3Relaciones {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Baraja ba = new Baraja();
        ba.connstruirbaraja();
        ba.barajar();
        System.out.println("................*..............");
        System.out.println(ba.cartasDisponibles());
        System.out.println("................*..............");
        ba.darCartas();
        System.out.println("................*..............");
        System.out.println("Cartas pedidas");
        System.out.println("................*..............");
        ba.cartasMonton();
        System.out.println("................*..............");
        System.out.println("Cartas que quedan en la baraja");
        System.out.println("................*..............");
        ba.mostrarBaraja();
    }

}
