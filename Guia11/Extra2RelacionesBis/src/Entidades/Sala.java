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
public class Sala {
    /**
     * Para representar la sala con los espectadores vamos a utilizar una
     * matriz. Los asientos son etiquetados por una letra y un número la fila A1
     * empieza al final del mapa como se muestra en la tabla.
     */
    Asiento [][] matriz = new Asiento[8][6];

    public Sala() {
    }

    public Asiento[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Asiento[][] matriz) {
        this.matriz = matriz;
    }
    
}
