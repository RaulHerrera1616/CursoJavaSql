/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import electrodomestico.entidades.Electrodomestico;
import electrodomestico.entidades.Lavadora;
import java.util.Scanner;


public class Lavadoraservice extends ElectrodomesticoService {
    
    
        /*
     Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
     */
    public Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in);
        Electrodomestico ser =crearElectrodomestico();
        System.out.println("Ingrese la carga que soporta la Lavadora");
        int carga = leer.nextInt();
        return new Lavadora(carga,ser.getPrecio() , ser.getColor(), ser.getConsumoEnergetico(), ser.getPeso());
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
     */
    public Double precioFinal(Lavadora lav) {
//        Lavadora lav = crearLavadora();
        double preFinal = super.precioFinal(lav);
        if (lav.getCarga() > 30) {
            preFinal += 500;
        }
        return preFinal;
    }
    public void mostrar(Lavadora lav) {
        System.out.println(lav.toString());
    }
}
