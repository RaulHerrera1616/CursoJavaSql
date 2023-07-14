/*
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return PI * this.radio * this.radio;
    }

    @Override
    public Double calcularPerimetro() {
        return PI * this.radio * 2;
    }
}
