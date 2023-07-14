/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra3Ralaciones;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;

public class CineServicio {

    /**
     * Para representar la sala con los espectadores vamos a utilizar una
     * matriz. Los asientos son etiquetados por una letra y un número la fila A1
     * empieza al final del mapa como se muestra en la tabla. También deberemos
     * saber si el asiento está ocupado por un espectador o no, si esta ocupado
     * se muestra una X, sino un espacio vacío.
     */
    public void generarAsiento(Cine cine) {
        String[] vector = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                cine.getSala().getMatriz()[i][j] = new Asiento(vector[j], 8 - i, null);
            }
        }
    }

    /**
     * Se debe realizar una pequeña simulación, en la que se generen muchos
     * espectadores y se los ubique en los asientos aleatoriamente (no se puede
     * ubicar un espectador donde ya este ocupado el asiento).
     * -----------------------------------------------------------------
     * ----------------------------------------------------------------- Los
     * espectadores serán ubicados de uno en uno y para ubicarlos tener en
     * cuenta que sólo se podrá sentar a un espectador si tiene el dinero
     * suficiente para pagar la entrada, si hay espacio libre en la sala y si
     * tiene la edad requerida para ver la película. En caso de que el asiento
     * este ocupado se le debe buscar uno libre.
     */
    public void ubicarEspecadores(Cine cine) {
        boolean bandera;
        int c = 0;
        for (int i = 0; i < 20; i++) {
            bandera = false;
            String nombre = "Espectador " + Integer.toString(i);
            int edad = (int) ((Math.random() * 60) + 10);
            float dinero = (float) (Math.random() * 300) + 100;
            if (dinero >= cine.getEntrada()) {
                if (edad >= cine.getPelicula().getEdadMinima()) {
                    do {
                        int fila = (int) (Math.random() * 8);
                        int columna = (int) (Math.random() * 6);
                        if (cine.getSala().getMatriz()[fila][columna].getPersona() == null) {
                            cine.getSala().getMatriz()[fila][columna].setPersona(new Espectador(nombre, edad, dinero));
                            bandera = true;
                            System.out.println(c++);
                        }
                    } while (!bandera);
                }
            }
        }
    }

    /**
     * mostrar tabla armada
     */
    public void tablaFinal(Cine cine) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (cine.getSala().getMatriz()[i][j].getPersona() == null) {
                    System.out.print(cine.getSala().getMatriz()[i][j].getNumero() + cine.getSala().getMatriz()[i][j].getLetra() + "  ");
                } else {
                    System.out.print(cine.getSala().getMatriz()[i][j].getNumero() + cine.getSala().getMatriz()[i][j].getLetra() + "X ");
                }
            }
            System.out.println("");
        }
    }
}
