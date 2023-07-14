/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import servicios.AutorService;
import servicios.ClienteService;
import servicios.EditorialService;
import servicios.LibroService;
import servicios.PrestamoService;

public class Main2 extends Application {
    
    AutorService Aser = new AutorService();
        EditorialService Eser = new EditorialService();
        LibroService Lser = new LibroService();
        ClienteService Cser = new ClienteService();
        PrestamoService Pser = new PrestamoService();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Biblioteca");

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.BASELINE_LEFT);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));

        Button btnMENU = new Button("------------- MENU ------------");
        Button btnCrearAutor = new Button("1. Crear Autor");
        Button btnCrearEditorial = new Button("2. Crear Editorial");
        Button btnCrearLibro = new Button("3. Crear Libro");
        Button btnCrearCliente = new Button("4. Crear Cliente");
        Button btnRegistrarPrestamo = new Button("5. Registrar Prestamo");
        Button btnBuscarAutorPorNombre = new Button("6. Búsqueda de Autor por Nombre");
        Button btnBuscarLibroPorISBN = new Button("7. Búsqueda de Libro por ISBN");
        Button btnBuscarLibroPorTitulo = new Button("8. Búsqueda de Libro por Título");
        Button btnBuscarLibroPorAutor = new Button("9. Búsqueda de Libro por Autor");
        Button btnBuscarLibroPorEditorial = new Button("10. Búsqueda de Libro por Editorial");
        Button btnBuscarEditorialPorNombre = new Button("11. Búsqueda de Editorial por Nombre");
        Button btnDevolverLibro = new Button("12. Devolución de Libro");
        Button btnListarPrestamosPorCliente = new Button("13. Listar Préstamos por Cliente");
        Button btnSalir = new Button("14. Salir");

        vbox.getChildren().addAll(btnMENU,btnCrearAutor, btnCrearEditorial, btnCrearLibro, btnCrearCliente,
                btnRegistrarPrestamo, btnBuscarAutorPorNombre, btnBuscarLibroPorISBN, btnBuscarLibroPorTitulo,
                btnBuscarLibroPorAutor, btnBuscarLibroPorEditorial, btnBuscarEditorialPorNombre, btnDevolverLibro,
                btnListarPrestamosPorCliente, btnSalir);

        Scene scene = new Scene(vbox, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Agregar la lógica de manejo de eventos a cada botón
        btnCrearAutor.setOnAction(e -> Aser.crearAutor());
        btnCrearEditorial.setOnAction(e -> Eser.crearEditorial());
        btnCrearLibro.setOnAction(e -> {
            try {
                Lser.crearLibro();
            } catch (Exception ex) {
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btnCrearCliente.setOnAction(e -> Cser.crearCliente());
        btnRegistrarPrestamo.setOnAction(e -> Pser.registrarPrestamo());
        btnBuscarAutorPorNombre.setOnAction(e -> {
            try {
                Aser.buscarAutorPorNombre();
            } catch (Exception ex) {
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btnBuscarLibroPorISBN.setOnAction(e -> Lser.buscarLibroPorISBN());
        btnBuscarLibroPorTitulo.setOnAction(e -> Lser.buscarLibroPorNombre());
        btnBuscarLibroPorAutor.setOnAction(e -> Lser.buscarLibroPorAutor());
        btnBuscarLibroPorEditorial.setOnAction(e -> Lser.buscarLibroPorEditorial());
        btnBuscarEditorialPorNombre.setOnAction(e -> {
            try {
                Eser.buscarEditorialPorNombre();
            } catch (Exception ex) {
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btnDevolverLibro.setOnAction(e -> Pser.devolverLibro());
        btnListarPrestamosPorCliente.setOnAction(e -> Pser.listarPrestamosPorCliente());
        btnSalir.setOnAction(e -> primaryStage.close());
    }
}
