/*
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package corregircodigo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Colecciones {


    public static void main(String[] args) {
        //Listas:
        ArrayList <Integer> numerosA = new ArrayList();//Lista de tipo Integer
        int x = 20;//Agregamos el numero 20 a la lista, en la posición 0
        int x1 = 30;
        int x2 = 40;
        int x3 = 50;
        int x4 = 60;
        int x5 = 70;
        numerosA.add(x);
        numerosA.add(x1);
        numerosA.add(x2);
        numerosA.add(x3);
        numerosA.add(x4);
        numerosA.add(x5);
        
        //Conjuntos:
        HashSet <Integer> numerosB = new HashSet();
        Integer y = 20;
        Integer y1 = 21;
        Integer y2= 22;
        Integer y3 = 23;
        Integer y4 = 24;
        Integer y5 = 25;
        numerosB.add(y);
        numerosB.add(y1);
        numerosB.add(y2);
        numerosB.add(y3);
        numerosB.add(y4);
        numerosB.add(y5);
        
        //Mapas:
        HashMap <Integer,String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        int dni1 = 25678987;
        String nombreAlumno1 = "Pepe";
        int dni2 = 12576134;
        String nombreAlumno2 = "Pepe";
        int dni3 = 3157689;
        String nombreAlumno3 = "Pepe";
        int dni4 = 34757989;
        String nombreAlumno4 = "Pepe";
        int dni5 = 22345189;
        String nombreAlumno5 = "Pepe";
        alumnos.put(dni, nombreAlumno);//Agregamos la llave y el valor
        alumnos.put(dni1, nombreAlumno1);
        alumnos.put(dni2, nombreAlumno2);
        alumnos.put(dni3, nombreAlumno3);
        alumnos.put(dni4, nombreAlumno4);
        alumnos.put(dni5, nombreAlumno5);
        
        numerosA.remove(2);
        numerosA.remove(x5);
        
        numerosB.remove(22);
        
        alumnos.remove(12576134);
        
    }
    
}
