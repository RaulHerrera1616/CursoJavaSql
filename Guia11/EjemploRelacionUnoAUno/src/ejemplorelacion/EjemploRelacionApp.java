/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ejemplorelacion;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author sistemas
 */
public class EjemploRelacionApp {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Dni dni1 = new Dni('A', 26441076);
        Persona persona1 = new Persona("Juan", "Perez", dni1);
        Persona persona2 = new Persona();
        Dni dni2 = new Dni();
        
        System.out.println("Nombre: " +persona1.getNombre());
        System.out.println("Apellido: " +persona1.getApellido());
        System.out.println("DNI Serie: " + persona1.getDni().getSerie());
        System.out.println("DNI Numero: " + persona1.getDni().getNumero());
        System.out.println("*-----------------------------------------------*");
        //crear persona con dni
        System.out.println("Nombre:");
        persona2.setNombre(leer.next());
        System.out.println("Apellido:");
        persona2.setApellido(leer.next());
        System.out.println("DNI Serie:");
        dni2.setSerie(leer.next().charAt(0));
        System.out.println("DNI Numero:");
        dni2.setNumero(leer.nextLong());
        persona2.setDni(dni2);
        System.out.println("*-----------------------------------------------*");
        System.out.println("Nombre: " +persona2.getNombre());
        System.out.println("Apellido: " +persona2.getApellido());
        System.out.println("DNI Serie: " + persona2.getDni().getSerie());
        System.out.println("DNI Numero: " + persona2.getDni().getNumero());
        
    }
    
}
