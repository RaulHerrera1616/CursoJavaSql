/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
nombreProductoss que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
 */
package Entidades;

import java.util.HashMap;


public class Tienda {
    private String nombreProduco;
    private Double precio;
    private HashMap<String,Double> Productos; 

    public Tienda() {
    }

    public Tienda(String nombreProduco, Double precio, HashMap<String, Double> Productos) {
        this.nombreProduco = nombreProduco;
        this.precio = precio;
        this.Productos = Productos;
    }

    public String getNombreProduco() {
        return nombreProduco;
    }

    public void setNombreProduco(String nombreProduco) {
        this.nombreProduco = nombreProduco;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public HashMap<String, Double> getProductos() {
        return Productos;
    }

    public void setProductos(HashMap<String, Double> Productos) {
        this.Productos = Productos;
    }    
    
    
}
