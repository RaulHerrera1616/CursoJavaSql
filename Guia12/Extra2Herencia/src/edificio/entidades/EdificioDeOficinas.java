/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package edificio.entidades;


public class EdificioDeOficinas extends Edificio {
    private Integer numOficinas;
    private Integer cantPerOfic;
    private Integer numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOficinas, Integer cantPerOfic, Integer numPisos, Double ancho, Double alto, Double largo) {
        super( ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPerOfic = cantPerOfic;
        this.numPisos = numPisos;
    }


    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantPerOfic() {
        return cantPerOfic;
    }

    public void setCantPerOfic(Integer cantPerOfic) {
        this.cantPerOfic = cantPerOfic;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", cantPerOfic=" + cantPerOfic + ", numPisos=" + numPisos + '}';
    }
    
}
