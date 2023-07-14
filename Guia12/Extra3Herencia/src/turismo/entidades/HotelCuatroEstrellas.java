/*
 Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package turismo.entidades;

import java.util.Scanner;


public class HotelCuatroEstrellas extends Hotel {
    private Boolean gimnasio;
    private String nombreRestaurante;
    private Integer capacidadRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(Boolean gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double PrecioHabitaciones, String nombre, String direccion, String localidad, String Gerente) {
        super(cantHabitaciones, numCamas, cantPisos, PrecioHabitaciones, nombre, direccion, localidad, Gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }


    public Boolean getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "HotelCuatroEstrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
    //Metodos
    public HotelCuatroEstrellas crearHotel(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Tiene gimnasio? s/n:");
        String opcion=leer.next();
        boolean gimnasio = opcion.equalsIgnoreCase("s") ? true : false;
        System.out.println("Nombre del restaurante: ");
        String nombreRestaurante = leer.next();
        System.out.println("Capacidad del restaurante: ");
        int capacidadRestaurante = leer.nextInt();
        System.out.println("Cantidad de habitaciones: ");
        int cantHabitaciones = leer.nextInt();
        System.out.println("Numero de camas: ");
        int numCamas = leer.nextInt();
        System.out.println("Cantidad de pisos: ");
        int cantPisos=leer.nextInt();
        double PrecioHabitaciones = precioHabitacion();
        System.out.println("Nombre del Hotel: ");
        String nombre=leer.next();
        System.out.println("Direccion: ");
        String direccion = leer.next();
        System.out.println("Localidad: ");
        String localidad=leer.next();
        System.out.println("Nombre del Gerente: ");
        String gerente = leer.next();
        
        
        returrn new HotelCuatroEstrellas(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, PrecioHabitaciones, nombre, direccion, localidad, gerente);
    }
    
    @Override
    public double precioHabitacion() {
        return
    }
    
}
