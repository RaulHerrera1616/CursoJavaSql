/*
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

*/
package servicios;

import entidades.Alquiler;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.YateLujo;
import java.time.temporal.ChronoUnit;


public class AlquilerService {
    
    public Double calcularPrecioAlquilerYate(Alquiler alqui,YateLujo yalu){
         
        YateLujoService ser1 = new YateLujoService();
        double modulo =ser1.valorModulo(yalu);
        long diasOcupacion=ChronoUnit.DAYS.between(alqui.getFechaAlquiler(), alqui.getFechaDevolucion());
        System.out.println("Modulo: "+modulo);
        System.out.println("Dias de Ocupacion: "+diasOcupacion);
        return diasOcupacion*modulo;
    }
     public Double calcularPrecioAlquilerVelero(Alquiler alqui,Velero vel){
        VeleroService ser2 = new VeleroService();
        double modulo =ser2.valorModulo(vel);
        long diasOcupacion=ChronoUnit.DAYS.between(alqui.getFechaAlquiler(), alqui.getFechaDevolucion());
        System.out.println("Modulo: "+modulo);
        System.out.println("Dias de Ocupacion: "+diasOcupacion);
        return diasOcupacion*modulo;
    }
      public Double calcularPrecioAlquilerBarcoMotor(Alquiler alqui,BarcoMotor barMo){
        BarcoMotorService ser3 = new BarcoMotorService();
        double modulo =ser3.valorModulo(barMo);
        long diasOcupacion=ChronoUnit.DAYS.between(alqui.getFechaAlquiler(), alqui.getFechaDevolucion());
        System.out.println("Modulo: "+modulo);
        System.out.println("Dias de Ocupacion: "+diasOcupacion);
        return diasOcupacion*modulo;
    }
}
//        long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
