/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conInterfazTiendaApp;

import Entidades.Tienda;
import Servicio.TiendaService;
import java.util.HashMap;

/**
 *
 * @author sistemas
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda miTienda = new Tienda("Nombre de mi tienda");
        TiendaService miTiendaService = new TiendaService("Raul");
        miTiendaService.introducirElemento("Producto 1", 10.0);
        miTiendaService.introducirElemento("Producto 2", 20.0);
        miTiendaService.modificarPrecio("Producto 1", 15.0);
        miTiendaService.eliminarProducto("Producto 2");
        HashMap<String, Double> productos = miTiendaService.mostrarProductos();
    }

}
