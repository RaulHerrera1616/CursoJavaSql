/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra3Ralaciones;

import Entidades.Cine;
import Entidades.Pelicula;
import Entidades.Sala;

/**
 *
 * @author iofefe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineServicio sv = new CineServicio();
        Pelicula pelicula = new Pelicula("Titac", 180, 30, "Cameron");
        Sala sala = new Sala();
        Cine cine = new Cine(sala, pelicula, 0);
        sv.generarAsiento(cine);
        sv.ubicarEspecadores(cine);
        sv.tablaFinal(cine);
    }

}
