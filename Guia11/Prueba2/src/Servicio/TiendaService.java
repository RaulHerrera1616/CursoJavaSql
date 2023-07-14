package Servicio;

import Entidades.Tienda;
import java.util.HashMap;

public class TiendaService {
private Tienda tienda;

    public TiendaService(String nombreTienda) {
        tienda = new Tienda(nombreTienda);
    }

    public void introducirElemento(String nombreProducto, double precio) {
        tienda.introducirElemento(nombreProducto, precio);
    }

    public void modificarPrecio(String nombreProducto, double precio) {
        tienda.modificarPrecio(nombreProducto, precio);
    }

    public void eliminarProducto(String nombreProducto) {
        tienda.eliminarProducto(nombreProducto);
    }

    public HashMap<String, Double> mostrarProductos() {
        return tienda.mostrarProductos();
    }
}