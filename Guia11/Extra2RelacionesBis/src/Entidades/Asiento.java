/*

 */
package Entidades;


public class Asiento {
    /**
     * Para representar la sala con los espectadores vamos a utilizar una
     * matriz. Los asientos son etiquetados por una letra y un número la fila A1
     * empieza al final del mapa como se muestra en la tabla.
     */
    private String letra;
    private int numero;
    private Espectador persona;

    public Asiento(String letra, int numero, Espectador persona) {
        this.letra = letra;
        this.numero = numero;
        this.persona = persona;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Espectador getPersona() {
        return persona;
    }

    public void setPersona(Espectador persona) {
        this.persona = persona;
    }
    
}
