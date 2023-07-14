/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashMap;

/**
 *
 * @author sistemas
 */
public class Tienda {

    private String nombre;
    private HashMap<String, Double> productos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        productos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void introducirElemento(String nombreProducto, double precio) {
        productos.put(nombreProducto, precio);
    }

    public void modificarPrecio(String nombreProducto, double precio) {
        productos.replace(nombreProducto, precio);
    }

    public void eliminarProducto(String nombreProducto) {
        productos.remove(nombreProducto);
    }

    public HashMap<String, Double> mostrarProductos() {
        return productos;
    }
}
