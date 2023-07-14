/*
Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package EjemploHerencia;

import animales.entidades.Animal;
import animales.entidades.Gato;
import animales.entidades.Perro;
import java.util.ArrayList;


public class EjemploHerenciaApp {


    public static void main(String[] args) {
       ArrayList<Animal> animales = new ArrayList<>();
       Animal a = new Animal();
       Animal b = new Perro();
       Animal c = new Gato();
       
       animales.add(a);
       animales.add(b);
       animales.add(c);
       
        for (Animal animale : animales) {
            System.out.println(animale.hacerRuido());
        }
    }
    
}
