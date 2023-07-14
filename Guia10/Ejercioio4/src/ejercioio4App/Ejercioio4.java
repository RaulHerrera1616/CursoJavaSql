/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercioio4App;

import Servicio.PeliculaService;

/**
 *
 * @author sistemas
 */
public class Ejercioio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService ser = new PeliculaService();
        
        ser.crearPelicula();
        ser.mostrarPeliculasEnPantalla();
        ser.mostrarMayorUnaHora();
        ser.ordenMayorAMenor();
        ser.ordenMenorAMayor();
        ser.directorAlfabeticamente();
        ser.tituloAlfabeticamente();
    }
    
}
