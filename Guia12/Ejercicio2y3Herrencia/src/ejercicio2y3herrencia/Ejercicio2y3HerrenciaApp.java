package ejercicio2y3herrencia;

import electrodomestico.entidades.Electrodomestico;
import electrodomestico.entidades.Lavadora;
import electrodomestico.entidades.Televisor;
import java.util.ArrayList;
import servicios.ElectrodomesticoService;
import servicios.Lavadoraservice;
import servicios.TelevisorService;

public class Ejercicio2y3HerrenciaApp {

    public static void main(String[] args) {
//        TelevisorService ser = new TelevisorService();
//        Televisor tele = ser.crearTelevisor();
//        System.out.println(ser.precioFinal(tele));
//        ser.mostrar(tele);
//
//        Lavadoraservice ser1 = new Lavadoraservice();
//        Lavadora lav = ser1.crearLavadora();
//        System.out.println(ser1.precioFinal(lav));
//        ser1.mostrar(lav);

//        Electrodomestico elec = new Electrodomestico();
        Televisor tele1 = new Televisor(32, true, 2000d, "Negro", 'B', 8);
        Televisor tele2 = new Televisor(52, true, 4000d, "blanco", 'A', 12);
        Lavadora lav1 = new Lavadora(15, 11000d, "amarilla", 'D', 32);
        Lavadora lav2 = new Lavadora(34, 20000d, "verde", 'A', 32);
        
        ElectrodomesticoService service = new ElectrodomesticoService();
        ArrayList<Electrodomestico> Electros = new ArrayList<>();
        Electros.add(tele1);
        Electros.add(tele2);
        Electros.add(lav1);
        Electros.add(lav2);
        double suma =0;
        for (Electrodomestico Electro : Electros) {
//            Electrodomestico aux = Electro;
            service.mostrar(Electro);
            System.out.println("Precio: "+service.precioFinal(Electro).toString());
            
            suma+=service.precioFinal(Electro);
            
        }
        System.out.println("La suma de todos los precios de los electrodomesticos es: "+suma);
    }
}
