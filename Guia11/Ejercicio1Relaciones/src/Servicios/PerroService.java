/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerroService {

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Perro> crearPerros() {
        ArrayList<Perro> perros = new ArrayList();
        String op=null;
        do {
             
        System.out.println("Ingrese el nombre del perro");
        String nombre=leer.next();
        System.out.println("Ingrese la raza del perro");
        String raza=leer.next();
        System.out.println("Ingrese la edad del perro");
        int edad =leer.nextInt();
        System.out.println("Ingrese el tamaño del perro");
        String tamanio=leer.next();
        Perro pe = new Perro(nombre, raza, edad, tamanio);
        perros.add(pe);
        System.out.println("Desea seguir ingresando perros s/n");
        op = leer.next();
        } while (op.equalsIgnoreCase("s"));
       
  
        return perros;
    }
}
