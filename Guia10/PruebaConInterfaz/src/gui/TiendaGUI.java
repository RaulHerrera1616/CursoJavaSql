/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import servicio.TiendaService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaGUI extends JFrame {
    private TiendaService tiendaService;
    private JTextField nombreProducto;
    private JTextField precioProducto;
    private JTextArea productos;

    public TiendaGUI() {
        tiendaService = new TiendaService();
        nombreProducto = new JTextField(50);
        precioProducto = new JTextField(50);
        productos = new JTextArea(30, 40);
        productos.setEditable(false);

        JButton introducir = new JButton("Introducir");
        introducir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreProducto.getText();
                Double precio = Double.parseDouble(precioProducto.getText()+"$");
                tiendaService.introducirElemento(nombre, precio);
                nombreProducto.setText("");
                precioProducto.setText("");
            }
        });

        JButton modificar = new JButton("Modificar");
        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreProducto.getText();
                Double precio = Double.parseDouble(precioProducto.getText());
                tiendaService.modificarPrecio(nombre, precio);
                nombreProducto.setText("");
                precioProducto.setText("");
            }
        });

        JButton eliminar = new JButton("Eliminar");
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreProducto.getText();
                tiendaService.eliminarProducto(nombre);
                nombreProducto.setText("");
                precioProducto.setText("");
            }
        });

        JPanel panel1 = new JPanel(new GridLayout(2, 2));
        panel1.add(new JLabel("Nombre del producto:"));
        panel1.add(nombreProducto);
        panel1.add(new JLabel("Precio del producto:"));
        panel1.add(precioProducto);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(introducir);
        panel2.add(modificar);
        panel2.add(eliminar);

        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(panel1, BorderLayout.NORTH);
        panel3.add(panel2, BorderLayout.CENTER);

        JPanel panel4 = new JPanel(new BorderLayout());
        panel4.add(productos, BorderLayout.CENTER);

        add(panel3, BorderLayout.NORTH);
        add(panel4, BorderLayout.CENTER);

        setTitle("Tienda");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarProductos() {
        productos.setText(tiendaService.mostrarProductos());
    }

    public static void main(String[] args) {
        TiendaGUI tiendaGUI = new TiendaGUI();
        tiendaGUI.mostrarProductos();
        tiendaGUI.setVisible(true);
    }
}
