/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Servicio.TiendaService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class TiendaGUI extends JFrame {

    private TiendaService tiendaService;
    private JLabel lblNombreProducto, lblPrecio;
    private JTextField txtNombreProducto, txtPrecio;
    private JButton btnIntroducir, btnModificar, btnEliminar, btnMostrar;
    private JTextArea txtAreaProductos;

    public TiendaGUI(String nombreTienda) {
        tiendaService = new TiendaService(nombreTienda);

        setLayout(new BorderLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel para introducir productos
        JPanel panelIntroducir = new JPanel();
        panelIntroducir.setLayout(new GridLayout(3, 2));
        lblNombreProducto = new JLabel("Nombre del producto:");
        panelIntroducir.add(lblNombreProducto);
        txtNombreProducto = new JTextField();
        panelIntroducir.add(txtNombreProducto);
        lblPrecio = new JLabel("Precio:");
        panelIntroducir.add(lblPrecio);
        txtPrecio = new JTextField();
        panelIntroducir.add(txtPrecio);
        btnIntroducir = new JButton("Introducir");
        btnIntroducir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreProducto = txtNombreProducto.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                tiendaService.introducirElemento(nombreProducto, precio);
                JOptionPane.showMessageDialog(null, "Producto introducido correctamente");
                txtNombreProducto.setText("");
                txtPrecio.setText("");
            }
        });
        panelIntroducir.add(btnIntroducir);
        add(panelIntroducir, BorderLayout.NORTH);

        // Panel para modificar o eliminar productos
        JPanel panelModificarEliminar
                = new JPanel();
        panelModificarEliminar.setLayout(new GridLayout(2, 2));
        btnModificar = new JButton("Modificar precio");
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreProducto = JOptionPane.showInputDialog(null, "Introduce el nombre del producto a modificar:");
                if (nombreProducto != null && !nombreProducto.isEmpty()) {
                    double precioNuevo = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el nuevo precio:"));
                    tiendaService.modificarPrecio(nombreProducto, precioNuevo);
                    JOptionPane.showMessageDialog(null, "Precio modificado correctamente");
                }
            }
        });
        panelModificarEliminar.add(btnModificar);
        btnEliminar = new JButton("Eliminar producto");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreProducto = JOptionPane.showInputDialog(null, "Introduce el nombre del producto a eliminar:");
                if (nombreProducto != null && !nombreProducto.isEmpty()) {
                    tiendaService.eliminarProducto(nombreProducto);
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                }
            }
        });
        panelModificarEliminar.add(btnEliminar);
        add(panelModificarEliminar, BorderLayout.CENTER);

        // Panel para mostrar los productos
        JPanel panelMostrar = new JPanel();
        panelMostrar.setLayout(new BorderLayout());
        txtAreaProductos = new JTextArea();
        txtAreaProductos.setEditable(false);
        panelMostrar.add(txtAreaProductos, BorderLayout.CENTER);
        btnMostrar = new JButton("Mostrar productos");
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HashMap<String, Double> productos = tiendaService.mostrarProductos();
                StringBuilder sb = new StringBuilder();
                sb.append("Productos:\n");
                for (String nombreProducto : productos.keySet()) {
                    double precio = productos.get(nombreProducto);
                    sb.append(nombreProducto).append(": ").append(precio).append("\n");
                }
                txtAreaProductos.setText(sb.toString());
            }
        });
        panelMostrar.add(btnMostrar, BorderLayout.SOUTH);
        add(panelMostrar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        TiendaGUI tiendaGUI = new TiendaGUI("Mi tienda");
    }
}
