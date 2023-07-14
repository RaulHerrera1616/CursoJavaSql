/*
El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario..
 */
package Servicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {

    private Set<String> paises = new HashSet<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPais() {
        String opcion = "s";
        System.out.println("Ingrese el nombre del país");
        String pais = leer.next();
        paises.add(pais);

        System.out.println("Desea ingresar otro país s/n");
        if ("s".equalsIgnoreCase(leer.next())) {
            crearPais();
        }
    }

    //mostrar el conjunto ordenado alfabéticamente.
    public void mostrarAlfabeticamente() {
        Set<String> paisesOrdenados = new TreeSet<>(paises);
        for (String paisesOrdenado : paisesOrdenados) {
            System.out.println(paisesOrdenado + " - ");
        }
    }

    //al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    //buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    //usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    //al usuario..
    public void eliminarPais() {
        boolean encontrado = false;
        System.out.println("Ingrese el país a eliminar");
        String paisEliminar = leer.next();

        Iterator<String> itera = paises.iterator();

        while (itera.hasNext()) {
            String next = itera.next();
            if (paisEliminar.equalsIgnoreCase(next)) {
                itera.remove();
                encontrado = true;
                break;
            }
        }
        //mostramos segun sea verdadero/falso si el perro estaba en la lista
        if (encontrado) {
            System.out.println("La raza fue eliminada de la lista");
        } else {
            System.out.println("La raza se encuentra en la lista");
        }
        for (String paise : paises) {
            System.out.println(paise);
        }
    }

}
