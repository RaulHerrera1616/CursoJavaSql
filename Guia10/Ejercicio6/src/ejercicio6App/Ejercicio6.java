/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio6App;

import Servicio.TiendaService;
import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
        TiendaService ser = new TiendaService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int opcion;
        do {
            System.out.print("\033[H\033[2J");  // Limpia la pantalla de la consola
        System.out.flush();
            System.out.println("*-------------MENU DE LA TIENDA-------------*");
            System.out.println("1. Ingresar Producto\n2. Modificar Precio del Producto\n3. Eliminar Producto\n4. Mostrar Productos de la Tienda\n5. Salir del Menu");
            System.out.println("Elija la opcion que desea realizar");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ser.introducirProducto();
                   
                    break;
                case 2:
                    ser.modificarPrecio();
                    break;
                case 3:
                    ser.eliminarProducto();
                    break;
                case 4:
                    ser.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Ud salio del Menu");
                    break;

            }
        } while (!(opcion == 5));
        
    }
    
}
