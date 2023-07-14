/*
 realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {

    private HashMap<String, Double> productos = new HashMap();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //introducir un elemento
    public void introducirProducto() {
        String val = "s";
        String nombreProducto;
        double precio;
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = leer.next();
        System.out.println("Ingrese el precio del producto");
        precio = leer.nextDouble();
        if (productos.containsKey(nombreProducto)) {
            System.out.println("El producto ya existe en la lista.");
        } else {
            productos.put(nombreProducto, precio);
            System.out.println("El producto se ha agregado correctamente.");
        }
//        productos.put(nombreProducto, precio);

        System.out.println("Desea ingresar otro producto");
        val = leer.next();
//        leer.next();
        if (val.equalsIgnoreCase("s")) {
            introducirProducto();

        }
    }

    //modificar su precio
    public void modificarPrecio() {
        System.out.println("Ingrese el producto que desea modificar su precio");
        String cambiarPrecio = leer.next();
        if (productos.containsKey(cambiarPrecio)) {
            System.out.println("Ingrese e nuevo precio");
            Double nuevoPrecio = leer.nextDouble();
            productos.put(cambiarPrecio, nuevoPrecio);
            System.out.println("Precio del producto " + cambiarPrecio + " modificado a " + nuevoPrecio + "$");
        } else {
            System.out.println("El producto " + cambiarPrecio + " no existe en la lista de productos");
        }
    }
    //eliminar un producto

    public void eliminarProducto() {
        System.out.println("Ingrese el producto que desea eliminar");
        String elimPro = leer.next();
        if (productos.containsKey(elimPro)) {
            productos.remove(elimPro);
        }

    }

    //mostrar los productos que tenemos con su precio 
    public void mostrarProductos() {
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Llave: " + key + " Valor: " + value + "$");

        }
    }

}
