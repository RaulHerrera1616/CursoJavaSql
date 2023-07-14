
package entidades;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name = "libro")
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer isbn;
    
    @Column (name = "titulo")
    private String titulo;
    
    @Column (name = "anio")
    private Integer anio;
    
    @Column (name = "ejemplares")
    private Integer ejemplares;
    
    @Column (name = "ejemplares_prestados")
    private Integer ejemplares_prestados;
    
    @Column (name = "ejemplares_restantes")
    private Integer ejemplares_restantes;
    
    @Column (name = "alta")
    private Boolean alta;
    
    @ManyToOne
    @JoinColumn (name = "autor_id")
    private Autor autor;
    
    @ManyToOne
    @JoinColumn (name = "editorial_id") 
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Integer isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplares_prestados, Integer ejemplares_restantes, Boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplares_prestados = ejemplares_prestados;
        this.ejemplares_restantes = ejemplares_restantes;
        this.alta = true;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(Integer ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public Integer getEjemplares_restantes() {
        return ejemplares_restantes;
    }

    public void setEjemplares_restantes(Integer ejemplares_restantes) {
        this.ejemplares_restantes = ejemplares_restantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

//    @Override
//    public String toString() {
//        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares=" + ejemplares + ", ejemplares_prestados=" + ejemplares_prestados + ", ejemplares_restantes=" + ejemplares_restantes + ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial + '}';
//    }
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    String horizontalLine = "+--------+-----------------------------------+----------+-------------+------------+--------------+------------+------------+------------+\n";
    String format = "| %-6s | %-33s | %-8s | %-11s | %-10s | %-12s | %-10s | %-10s | %-10s |\n";

    sb.append(horizontalLine);
    sb.append(String.format(format, "ISBN", "Título", "Año", "Ejemplares", "Prestados", "Restantes", "Alta", "Autor", "Editorial"));
    sb.append(horizontalLine);
    sb.append(String.format(format, isbn, titulo, anio, ejemplares, ejemplares_prestados, ejemplares_restantes, alta, autor.getId(), editorial.getId()));
    sb.append(horizontalLine);

    return sb.toString();
}
}
