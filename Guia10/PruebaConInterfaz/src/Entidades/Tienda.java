/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Tienda extends JFrame implements ActionListener {
    private JTextField nombre;
    private JTextField precio;
    private JTextArea productos;
    private JButton introducirElemento;
    private JButton modificarPrecio;
    private JButton eliminarProducto;
    private JButton mostrarProductos;

    private HashMap<String, Double> productosMap = new HashMap<String, Double>();

    public Tienda() {
        super("Tienda");
        setLayout(new FlowLayout());

        JLabel nombreLabel = new JLabel("Nombre:");
        add(nombreLabel);

        nombre = new JTextField(20);
        add(nombre);

        JLabel precioLabel = new JLabel("Precio:");
        add(precioLabel);

        precio = new JTextField(20);
        add(precio);

        introducirElemento = new JButton("Introducir Elemento");
        introducirElemento.addActionListener(this);
        add(introducirElemento);

        modificarPrecio = new JButton("Modificar Precio");
        modificarPrecio.addActionListener(this);
        add(modificarPrecio);

        eliminarProducto = new JButton("Eliminar Producto");
        eliminarProducto.addActionListener(this);
        add(eliminarProducto);

        mostrarProductos = new JButton("Mostrar Productos");
        mostrarProductos.addActionListener(this);
        add(mostrarProductos);

        productos = new JTextArea(10, 20);
        productos.setEditable(false);
        add(productos);

        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == introducirElemento) {
            String nombreProducto = nombre.getText();
            Double precioProducto = Double.parseDouble(precio.getText());
            productosMap.put(nombreProducto, precioProducto);
            nombre.setText("");
            precio.setText("");
            JOptionPane.showMessageDialog(null, "Producto introducido correctamente.");
        } else if (e.getSource() == modificarPrecio) {
            String nombreProducto = nombre.getText();
            Double precioProducto = Double.parseDouble(precio.getText());
            if (productosMap.containsKey(nombreProducto)) {
                productosMap.put(nombreProducto, precioProducto);
                JOptionPane.showMessageDialog(null, "Precio modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe.");
            }
            nombre.setText("");
            precio.setText("");
        } else if (e.getSource() == eliminarProducto) {
            String nombreProducto = nombre.getText();
            if (productosMap.containsKey(nombreProducto)) {
                productosMap.remove(nombreProducto);
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe.");
            }
            nombre.setText("");
            precio.setText("");
        } else if (e.getSource() == mostrarProductos) {
            String textoProductos = "";
            for (Map.Entry<String, Double> entry : productosMap.entrySet()) {
                textoProductos += entry.getKey() + ": " + entry.getValue() + "\n";
            }
            productos.setText(textoProductos);
        }
    }
}
