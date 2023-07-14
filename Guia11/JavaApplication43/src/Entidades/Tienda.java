/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
nombreProductoss que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
 */
package Entidades;

import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Tienda extends JFrame {
    private HashMap<String, Double> productos = new HashMap();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private JPanel panelAgregarProducto;
    private JTextField txtNombreProducto;
    private JTextField txtPrecioProducto;
    private JButton btnAgregarProducto;
    
    private JPanel panelModificarPrecio;
    private JTextField txtModificarProducto;
    private JTextField txtNuevoPrecio;
    private JButton btnModificarPrecio;
    
    private JPanel panelEliminarProducto;
    private JTextField txtEliminarProducto;
    private JButton btnEliminarProducto;
    
    private JPanel panelMostrarProductos;
    private JTextArea txtListaProductos;

    public Tienda() {
        // constructor

        // Panel agregar producto
        panelAgregarProducto = new JPanel();
        txtNombreProducto = new JTextField(10);
        txtPrecioProducto = new JTextField(10);
        btnAgregarProducto = new JButton("Agregar producto");
        panelAgregarProducto.add(new JLabel("Nombre del producto:"));
        panelAgregarProducto.add(txtNombreProducto);
        panelAgregarProducto.add(new JLabel("Precio del producto:"));
        panelAgregarProducto.add(txtPrecioProducto);
        panelAgregarProducto.add(btnAgregarProducto);

        // Panel modificar precio
        panelModificarPrecio = new JPanel();
        txtModificarProducto = new JTextField(10);
        txtNuevoPrecio = new JTextField(10);
        btnModificarPrecio = new JButton("Modificar precio");
        panelModificarPrecio.add(new JLabel("Producto a modificar:"));
        panelModificarPrecio.add(txtModificarProducto);
        panelModificarPrecio.add(new JLabel("Nuevo precio:"));
        panelModificarPrecio.add(txtNuevoPrecio);
        panelModificarPrecio.add(btnModificarPrecio);

        // Panel eliminar producto
        panelEliminarProducto = new JPanel();
        txtEliminarProducto = new JTextField(10);
        btnEliminarProducto = new JButton("Eliminar producto");
        panelEliminarProducto.add(new JLabel("Producto a eliminar:"));
        panelEliminarProducto.add(txtEliminarProducto);
        panelEliminarProducto.add(btnEliminarProducto);

        // Panel mostrar productos
        panelMostrarProductos = new JPanel();
        txtListaProductos = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(txtListaProductos);
        panelMostrarProductos.add(scrollPane);
    }
}