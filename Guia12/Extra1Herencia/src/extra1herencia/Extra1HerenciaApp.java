/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler. */
package extra1herencia;

import entidades.Alquiler;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.YateLujo;
import java.time.LocalDate;
import java.time.Month;
import servicios.AlquilerService;
import servicios.YateLujoService;

public class Extra1HerenciaApp {

    public static void main(String[] args) {
    
        YateLujo yalu = new YateLujo(200, 4, "ABC123", 60d, 2018);
        Alquiler alq = new Alquiler("Raul", 26441076, LocalDate.of(2023, 02, 22),
                LocalDate.of(2023, 03, 23), 2, yalu);
        AlquilerService ser = new AlquilerService();       
        System.out.println("Alquiler Para: "+alq.toString());
        System.out.println("Precio del alquiler: "+ser.calcularPrecioAlquilerYate(alq,yalu)+"$");
        
        BarcoMotor barMo = new BarcoMotor(150, "MNB546", 45d, 2017);
        Alquiler alq1 = new Alquiler("Pedro", 34567543, LocalDate.of(2023, 01, 05),
                LocalDate.of(2023,02, 15), 4, barMo);
        AlquilerService ser1 = new AlquilerService();
         System.out.println("Alquiler Para: "+alq1.toString());
        System.out.println("Precio del alquiler: "+ser1.calcularPrecioAlquilerBarcoMotor(alq1, barMo)+"$");
        
        Velero vel = new Velero(2, "JHG654", 30d, 2019);
        Alquiler alq2 = new Alquiler("Juan", 38256453, LocalDate.of(2023, 04, 11),
                LocalDate.of(2023, 05, 02), 5, vel);
        AlquilerService ser2 = new AlquilerService();
         System.out.println("Alquiler Para: "+alq2.toString());
        System.out.println("Precio del alquiler: "+ser2.calcularPrecioAlquilerVelero(alq2, vel)+"$");
    }

}
