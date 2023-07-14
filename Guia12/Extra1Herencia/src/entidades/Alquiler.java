/*
Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará. */
package entidades;

import java.time.LocalDate;


public class Alquiler {
    private String nombre;
    private Integer dniCliente;
    private LocalDate FechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dniCliente, LocalDate FechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.FechaAlquiler = FechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Integer dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate FechaAlquiler) {
        this.FechaAlquiler = FechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\nDNI del Cliente: " + dniCliente + "\nFecha de Alquiler: " + FechaAlquiler + "\nFecha de Devolucion: " + fechaDevolucion + "\nPosicion del Amarre: " + posicionAmarre + "\nBarco=" + barco ;
    }
    
}
