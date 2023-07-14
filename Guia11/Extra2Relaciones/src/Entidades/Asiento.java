/*

 */
package Entidades;


public class Asiento {
    private int numero;
    private String letra;
    private Espectador persona;

    public Asiento() {
    }

    public Asiento(int numero, String letra, Espectador persona) {
        this.numero = numero;
        this.letra = letra;
        this.persona = persona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Espectador getPersona() {
        return persona;
    }

    public void setPersona(Espectador persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return  numero + "" + letra + "" + persona + '}';
    }
    
}
