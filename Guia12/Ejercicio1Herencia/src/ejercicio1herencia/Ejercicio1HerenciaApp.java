/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1herencia;

import animal.entidades.Animal;
import animal.entidades.Caballo;
import animal.entidades.Gato;
import animal.entidades.Perro;

/**
 *
 * @author sistemas
 */
public class Ejercicio1HerenciaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stich", "carnivoro", 15, "Doberman");
        perro1.alimentarse();
        
        //Declaracion de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
        //Declaracion del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();
        
        //Declaracion del objeto Gato
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
    }
    
}
