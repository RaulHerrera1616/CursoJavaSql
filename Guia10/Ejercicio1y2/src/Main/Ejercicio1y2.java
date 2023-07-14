/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1y2 {


    public static void main(String[] args) {
        //guardo razas de perros en un ArrayList de tipo String
        ArrayList<String> razas = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int cont = 1;
        String raza;
        String opcion;
        String razaEliminar;
        //Utilizo bucle for para pedir razas de perros
        for (int i = 0; i < cont; i++) {
            System.out.println("Ingrese una raza");
            raza = leer.nextLine();
            razas.add(raza);

            System.out.println("Desea ingresar otra raza s/n");
            opcion = leer.nextLine();
            //En un condicional verifico si es verdadero para incrementar el contador
            //para poder ingresar mas razas de perros
            if (opcion.equalsIgnoreCase("s")) {
                cont++;
                //si el condicional es falso ingreso un break para finalizar el bucle 
            } else {
                break;

            }

        }
        //muestra las razas en la forma que se ingreso
        for (String raza1 : razas) {
            System.out.println(raza1);
        }
        //Se pide la raza que desea eliminar
        System.out.println("Ingreze la raza a eliminar");
        razaEliminar = leer.nextLine();
        
        boolean encontrado = false;
        //Se recorre la lista con un Iterator
        Iterator<String> itera = razas.iterator();
        System.out.println("Razas de perros: ");
        while (itera.hasNext()) {
            String raza1 = itera.next();
            //condicionamos para ver si la raza a eliminar esta en la lista
            if (raza1.equalsIgnoreCase(razaEliminar)) {
                itera.remove();
                encontrado = true;
                break;
            }
            
        }
        //mostramos segun sea verdadero/falso si el perro estaba en la lista
        if (encontrado) {
            System.out.println("La raza fue eliminada de la lista");
        }else{
            System.out.println("La raza se encuentra en la lista");
        }
        //Ordeno la lista en forma ascendente
        Collections.sort(razas);
        //muestro la lista actualizada
        for (String raza1 : razas) {
            System.out.println(raza1);
        }
    }

}
