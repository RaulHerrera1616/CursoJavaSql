/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PerroService serv = new PerroService();

    public ArrayList<Persona> crearPersona() {
        ArrayList<Persona> personas = new ArrayList();
        String op;
        do {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Ingrese el apellido de la persona");
            String apellido = leer.next();
            System.out.println("Ingrese la edad de la persona");
            int edad = leer.nextInt();
            System.out.println("Ingrese el documento de la persona");
            int documento = leer.nextInt();
            Persona per = new Persona(nombre, apellido, edad, documento);
            personas.add(per);
            System.out.println("Desea seguir ingresando personas s/n");
            op = leer.next();
        } while (op.equalsIgnoreCase("s"));
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        return personas;
    }

    public void adoptarPerro(ArrayList<Persona> personas, ArrayList<Perro> perros, HashMap<Persona, Perro> adoptar) {
            int indice = 0; // agregamos una variable de índice y la inicializamos en 0
    while (indice < perros.size()) { // cambiamos el bucle "for" por un bucle "while" y comprobamos el tamaño de la lista
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " Indique el nombre del perro que desea adoptar o escriba 'no' para no adoptar:");
            String nomPe = leer.next();
            if (nomPe.equalsIgnoreCase("no")) {
                continue; // si la persona no quiere adoptar un perro, saltamos a la siguiente persona
            }
            Perro perroElegido = null;
            for (Perro perro : perros) {
                if (nomPe.equalsIgnoreCase(perro.getNombre())) {
                    perroElegido = perro;
                    break;
                }
            }
            if (perroElegido == null) {
                System.out.println("El perro elegido no se encuentra en la lista o ya fue adoptado.");
            } else {
                adoptar.put(persona, perroElegido);
                personas.remove(persona);
                perros.remove(perroElegido);
                System.out.println(persona.getNombre() + " adoptó a " + perroElegido.getNombre());
                indice = 0; // reiniciamos el índice a 0 después de que se ha adoptado un perro
            }
        }
        indice++; // incrementamos el índice al final del bucle "for"
    }
    for (Map.Entry<Persona, Perro> entry : adoptar.entrySet()) {
        Persona persona = entry.getKey();
        Perro perro = entry.getValue();
        System.out.println("Persona: " + persona.getNombre() + " " + persona.getApellido()
                + " adoptó al perro " + perro.getNombre() + " (" + perro.getRaza() + ")");
    }
}
}


//        for (Perro perro : perros) {
//            System.out.println(perro);
//        }
//        for (Persona persona : personas) {
//            System.out.println(persona.getNombre() + "Indique el nombre del perro que desea adoptar");
//            String nomPe = leer.next();
//            for (Perro perro : perros) {
//                System.out.println(perro.getNombre());
//                if (nomPe.equalsIgnoreCase(perro.getNombre())) {
//                    adoptar.put(persona, perro);
//                    personas.remove(persona);
//                    perros.remove(perro);
//                    System.out.println(persona);
//                    System.out.println(perro);
//                }else{
//                    System.out.println("El perro elegido no se encuentra en la lista o ya fue adoptado");
//                }
//                
//            }
//        }
//        for (Map.Entry<Persona, Perro> entry : adoptar.entrySet()) {
//            Persona persona = entry.getKey();
//            Perro perro = entry.getValue();
//            System.out.println("Persona: " + persona.getNombre() + " " + persona.getApellido()
//                    + " adoptó al perro " + perro.getNombre() + " (" + perro.getRaza() + ")");
//        }
//    }
//
//}
/*
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Persona> crearPersona() {
        ArrayList<Persona> personas = new ArrayList();
        String op;
        do {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Ingrese el apellido de la persona");
            String apellido = leer.next();
            System.out.println("Ingrese la edad de la persona");
            int edad = leer.nextInt();
            System.out.println("Ingrese el documento de la persona");
            int documento = leer.nextInt();
            Persona per = new Persona(nombre, apellido, edad, documento);
            personas.add(per);
            System.out.println("Desea seguir ingresando personas s/n");
            op = leer.next();
        } while (op.equalsIgnoreCase("s"));

        return personas;
    }

    public void adoptarPerro(ArrayList<Persona> personas, ArrayList<Perro> perros, HashMap<Persona, Perro> adoptar) {
        System.out.println("Listado de perros: ");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        System.out.println("Listado de personas: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        Iterator<Persona> itPer = personas.iterator();
        Iterator<Perro> itPerro = perros.iterator();
        int iteradorPersona = 0;
        while (itPer.hasNext()) {
            Persona per = personas.get(iteradorPersona);
            System.out.println(per.getNombre());
            System.out.println("Ingresa el perro que desea adoptar");
            String nomPe = leer.next();
            int iteradorPerro = 0;
            while (itPerro.hasNext()) {
                Perro perro = perros.get(iteradorPerro);
                iteradorPerro++;
                System.out.println(perro.getNombre());
                if (nomPe.equalsIgnoreCase(perro.getNombre())) {
                    adoptar.put(per, perro);
                    personas.remove(per);
                    perros.remove(perro);

                    break;
                } else {
                    System.out.println("El perro elegido no se encuentra en la lista o ya fue adoptado");
                }

            }
        }

        for (Map.Entry<Persona, Perro> entry : adoptar.entrySet()) {
            Persona persona = entry.getKey();
            Perro perro = entry.getValue();
            System.out.println("Persona: " + persona.getNombre() + " " + persona.getApellido()
                    + " adoptó al perro " + perro.getNombre() + " (" + perro.getRaza() + ")");
        }
    }
}
package main;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import servicio.PerroService;
import servicio.PersonaService;

public class Main {

    public static void main(String[] args) {

        PersonaService ser = new PersonaService();
        PerroService serv = new PerroService();
        ArrayList<Perro> perros = serv.crearPerros();
        ArrayList<Persona> personas = ser.crearPersona();
        HashMap<Persona, Perro> adoptar = new HashMap<>();
        ser.adoptarPerro(personas, perros, adoptar);
    }
}
*/
