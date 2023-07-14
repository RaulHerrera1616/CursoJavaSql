/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio1relacionesApp;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.PerroService;
import Servicios.PersonaService;
import java.util.ArrayList;
import java.util.HashMap;


public class Ejercicio1Relaciones {

 
    public static void main(String[] args) {
    
          PersonaService ser = new PersonaService();
          PerroService serv = new PerroService();
          ArrayList<Perro> perros =serv.crearPerros();
          ArrayList<Persona> personas = ser.crearPersona();
          HashMap<Persona,Perro> adoptar = new HashMap<>();

          ser.adoptarPerro(personas, perros, adoptar);
                  


    }
    
}
