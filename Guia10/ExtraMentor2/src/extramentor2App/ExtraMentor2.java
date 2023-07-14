/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package extramentor2App;

import Entidades.CantanteFamoso;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExtraMentor2 {

    public static void main(String[] args) {
        List<CantanteFamoso> cantantes = new ArrayList();

        cantantes.add(new CantanteFamoso("Curt Covain", "Nevermin"));
        cantantes.add(new CantanteFamoso("Eminem", "The Marshall Mathers LP"));
        cantantes.add(new CantanteFamoso("Led Zeppelin", "Led Zeppelin IV"));
        cantantes.add(new CantanteFamoso("Soda Estereo", "Canción Animal"));
        cantantes.add(new CantanteFamoso("Fito Paez", "El amor despues del amor"));

        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante.getNombre() + " - " + cantante.getDiscoConMasVentas());
        }
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc = 0;
        do {
            System.out.println("*----ELIJA LA OPCION QUE DESEA REALIZAR----*");
            System.out.println("1. Agregar cantante\n2. Mostrar todos los cantantes"
                    + "\n3. Eliminar un cantante\n4. Salir ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    CantanteFamoso ca = new CantanteFamoso();
                    System.out.println("Ingrese el nombre del cantante");
                    ca.setNombre(leer.next());
                    System.out.println("Ingrese el disco de mayor ventas");
                    ca.setDiscoConMasVentas(leer.next());
                    cantantes.add(ca);
                    break;
                case 2:
                    System.out.println("*----Mostrando todos los cantantes----*");
                    for (CantanteFamoso cantante : cantantes) {
                        System.out.println(cantante.getNombre() + " - " + cantante.getDiscoConMasVentas());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del cantante que desea eliminar");
                    String eliminar = leer.next();
                    boolean encontrado = false;
                    Iterator<CantanteFamoso> it = cantantes.iterator();
                    while (it.hasNext()) {
                        CantanteFamoso aux = it.next();
                        if (eliminar.equalsIgnoreCase(aux.getNombre())) {
                            it.remove();
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("El cantante fue eliminada de la lista");
                    } else {
                        System.out.println("El cantante no se encuentra en la lista");
                    }
                    break;
                case 4:
                    System.out.println("Ud salió del Menu");
                    break;

            }
        } while (opc != 4);

    }

}
