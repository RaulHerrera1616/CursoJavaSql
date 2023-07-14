/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class YateLujo extends Barco {

    public Integer potenciaCV;
    public Integer numCamarotes;

    public YateLujo() {
    }

    public YateLujo(Integer potenciaCV, Integer numCamarotes, String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return ":::::Yate de Lujo:::::" + "\nPotenciaCV: " + potenciaCV + "\nNumero de Camarotes: " + numCamarotes + "\nMatricula: " + getMatricula() + "\nEslora: " + getEslora() + "\nAño de Fabricación: " + getAnioFabricacion();
    }

}
