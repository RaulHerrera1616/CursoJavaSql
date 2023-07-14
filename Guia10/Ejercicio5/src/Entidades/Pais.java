/*
El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Entidades;

import java.util.HashSet;
import java.util.Set;


public class Pais {
    private String nombrePais;
    private Set<String> Paises;

    public Pais() {
    }

    public Pais(String nombrePais, HashSet<String> Paises) {
        this.nombrePais = nombrePais;
        this.Paises = Paises;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Set<String> getPaises() {
        return Paises;
    }

    public void setPaises(HashSet<String> Paises) {
        this.Paises = Paises;
    }
    
    
}
