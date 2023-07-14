/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sistemas
 */
@Entity
@Table (name="cliente")
public class Cliente implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="documento")
    private Long documento;
    
    @Column(name = "nombre")
    public String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="telefono")
    private String telefono;

    public Cliente() {
    }

    public Cliente(Long id, Long documento, String nombre, String apellido, String telefono) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

//    @Override
//    public String toString() {
//        return "Cliente{" + "id=" + id + ", documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
//    }
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    String horizontalLine = "+--------+----------------------+-----------------+-------------+----------------+--------------+------------+------------+------------+\n";
    String format = "| %-6s | %-20s | %-15s | %-14s | %-10s |\n";

    sb.append(horizontalLine);
    sb.append(String.format(format, "Id", "Documento", "Nombre", "Apellido", "Telefono"));
    sb.append(horizontalLine);
    sb.append(String.format(format, id, documento, nombre, apellido, telefono ));
    sb.append(horizontalLine);

    return sb.toString();
}
}