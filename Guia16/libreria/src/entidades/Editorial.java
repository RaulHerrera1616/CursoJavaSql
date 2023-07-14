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
 * @author Raul Herrera
 */
@Entity
@Table(name = "editorial")
public class Editorial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "alta")
    private Boolean alta;

    public Editorial() {
    }

    public Editorial(Integer id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

//    @Override
//    public String toString() {
//        return "Editorial{" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
//    }
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    String horizontalLine = "+-------+-----------------------------+----------+\n";
    String format = "| %-5s | %-27s | %-8s |\n";

    sb.append(horizontalLine);
    sb.append(String.format(format, "Id", "Nombre", "Alta"));
    sb.append(horizontalLine);
    sb.append(String.format(format, id, nombre, alta));
    sb.append(horizontalLine);

    return sb.toString();
}

}
