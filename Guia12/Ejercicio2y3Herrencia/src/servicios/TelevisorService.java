
package servicios;

import electrodomestico.entidades.Electrodomestico;
import electrodomestico.entidades.Televisor;
import java.util.Scanner;


public class TelevisorService extends ElectrodomesticoService {
       
        public Televisor crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico ser = crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas");
        int resolucion = leer.nextInt();
        System.out.println("¿Tiene sintonizador TDA? s/n");
        String opc = leer.next();
        boolean bandera;
        if (opc.equalsIgnoreCase("s")) {
            bandera = true;
        } else {
            bandera = false;
        }
        boolean sintonizadorTDT=bandera;
        
        return new Televisor(resolucion, sintonizadorTDT, ser.getPrecio(),ser.getColor(), ser.getConsumoEnergetico(),ser.getPeso());
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
     */
    public Double precioFinal(Televisor tele) {
//        Televisor tele = crearTelevisor();
        double preFinal = super.precioFinal(tele);
        if (tele.getResolucion() > 40 && tele.getSintonizadorTDT()) {
            preFinal = (preFinal * 1.3) + 500;
        } else if (tele.getSintonizadorTDT() && tele.getResolucion() <= 40) {
            preFinal += 500;
        } else if (tele.getResolucion() > 40) {
            preFinal *= 1.3;
        }
        System.out.println(preFinal);
        return preFinal;

    }
    public void mostrar(Televisor tele) {
        System.out.println(tele.toString());
    }
}
