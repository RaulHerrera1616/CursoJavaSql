/*
Crear una clase Carta con los atributos número y palo, y un método toString() para 
mostrar la carta en formato "número de carta" - "palo".
 */
package Entidades;


public class Carta {
    private int numero;
    private String palo;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  "numero=" + numero + ", palo=" + palo + "\n";
    }
    
    
}
