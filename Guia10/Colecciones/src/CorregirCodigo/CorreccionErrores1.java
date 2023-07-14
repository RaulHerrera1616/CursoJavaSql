/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorregirCodigo;

import java.util.ArrayList;
import java.util.Iterator;

public class CorreccionErrores1 {

    public static void main(String[] args) {
                ArrayList<String> listas = new ArrayList();
                listas.add("A");
                listas.add("B");
                
                //Creamos el iterator para recorrer la lista
                Iterator iterator = listas.iterator();//Devolvemos el iterator
                System.out.println("Elementos de la lista: ");
                
                //Armamos un bucle while, siempre que el hasnext() devuelva true
                while (iterator.hasNext()) {
                    System.out.println(iterator.next()+ " ");
                }
                System.out.println("");

//        ArrayList<String> bebidas = new ArrayList();
//
//        bebidas.add("café");
//        bebidas.add("té");
//
//        Iterator<String> it = bebidas.iterator();
//
//        while (it.hasNext()) {
//            if (it.next().equals("café")) {
//                it.remove();
//            }
//        }
        ArrayList<String> libros = new ArrayList<>();
        String t1 = "La casa del miedo";
        String t2 = "Santa Evita";
        String t3 = "Como agua para chocolate";
        libros.add(t1);
        libros.add(t2);
        libros.add(t3);
        
        Iterator it = libros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }
        System.out.println("");
    }

}
