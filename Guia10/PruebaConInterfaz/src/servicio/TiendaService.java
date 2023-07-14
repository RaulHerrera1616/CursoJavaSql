/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.HashMap;

/**
 *
 * @author sistemas
 */
public class TiendaService {

    private HashMap<String, Double> productos;

    public TiendaService() {
        productos = new HashMap<>();
    }

    public void introducirElemento(String nombre, Double precio) {
        productos.put(nombre, precio);
    }

    public void modificarPrecio(String nombre, Double precio) {
        if (productos.containsKey(nombre)) {
            productos.replace(nombre, precio);
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        }
    }

    public String mostrarProductos() {
        StringBuilder sb = new StringBuilder();
        for (String key : productos.keySet()) {
            sb.append(key).append(": $").append(productos.get(key)).append("\n");
        }
        return sb.toString();
    }
}
