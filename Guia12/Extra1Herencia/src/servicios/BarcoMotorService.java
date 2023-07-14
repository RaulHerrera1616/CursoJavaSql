/*
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco.
En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV 
y en los yates se suma la potencia en CV y el número de camarotes.  */
package servicios;

import entidades.BarcoMotor;

public class BarcoMotorService extends BarcoService {

    public Double valorModulo(BarcoMotor barMot) {
        return super.valorModulo(barMot) + barMot.getPotenciaCV();
    }
}