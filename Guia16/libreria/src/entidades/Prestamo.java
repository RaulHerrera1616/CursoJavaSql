/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Raul Herrera
 */
@Entity
@Table(name = "prestamo")
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date fecha_prestamo;

    @Temporal(TemporalType.DATE)
    private Date fecha_devolucion;

    @ManyToOne
    @JoinColumn(name = "libro_isbn")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @Column(name = "alta")
    private Boolean alta = true;
    public Prestamo() {
    }

    public Prestamo(Integer id, Date fecha_prestamo, Date fecha_devolucion, Libro libro, Cliente cliente, Boolean alta) {
        this.id = id;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.libro = libro;
        this.cliente = cliente;
        this.alta = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

//
//    @Override
//    public String toString() {
//        return "Prestamo{" + "id=" + id + ", fecha_prestamo=" + fecha_prestamo + ", fecha_devolucion=" + fecha_devolucion + ", libro=" + libro + ", cliente=" + cliente + '}';
//    }
    @Override
public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String fechaFormateada = dateFormat.format(fecha_prestamo);
    String fechaFormateada1 = dateFormat.format(fecha_devolucion);
    StringBuilder sb = new StringBuilder();
    String horizontalLine = "+--------+----------------+------------------+--------+---------+\n";
    String format = "| %-6s | %-14s | %-16s | %-6s | %-7s |\n";

    sb.append(horizontalLine);
    sb.append(String.format(format, "ID", "Fecha_Prestamo", "Fecha_Devolucion", "Libro", "Cliente"));
    sb.append(horizontalLine);
    sb.append(String.format(format, id, fechaFormateada, fechaFormateada1, libro.getIsbn(), cliente.getId()));
    sb.append(horizontalLine);

    return sb.toString();
}
}
