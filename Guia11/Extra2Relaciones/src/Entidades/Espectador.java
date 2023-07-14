/*
Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
package Entidades;


public class Espectador {
    private String nombre;
    private int edad;
    private double dineroDisp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(double dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", edad=" + edad + ", dineroDisp=" + dineroDisp  ;
    }

}
/*
public class Espectador {
    private String nombre;
    private int edad;
    private double dineroDisp;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}
*/
