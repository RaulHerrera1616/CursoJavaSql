/*
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package entidades;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public Double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }

}
